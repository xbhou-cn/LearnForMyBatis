/**
 * 
 */
package cn.xbhou.learn.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import cn.xbhou.learn.proxy.interceptor.Interceptor;

/**
 * @author 侯效标
 *
 */
public class InterceptorJdkProxy implements InvocationHandler {
    private Object target;
    private String interceptorClass;

    public InterceptorJdkProxy(Object target, String interceptorClass) {
        this.target = target;
        this.interceptorClass = interceptorClass;
    }

    public static Object bind(Object target, String interceptorClass) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InterceptorJdkProxy(target, interceptorClass));
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object,
     * java.lang.reflect.Method, java.lang.Object[])
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (this.interceptorClass == null) {
            return method.invoke(proxy, args);
        }
        Object result = null;
        Interceptor interceptor = (Interceptor) Class.forName(interceptorClass).newInstance();
        if (interceptor.before(proxy, args, method, args)) {
            result = method.invoke(this.target, args);
        } else {
            interceptor.around(proxy, args, method, args);
        }
        interceptor.after(proxy, args, method, args);
        return result;
    }

}
