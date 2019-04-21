/**
 * 
 */
package cn.xbhou.learn.proxy.interceptor;

import java.lang.reflect.Method;

/**
 * @author 侯效标
 *
 */
public class MyInterceptor implements Interceptor {

    /*
     * (non-Javadoc)
     * 
     * @see cn.xbhou.learn.proxy.interceptor.Interceptor#before(java.lang.Object,
     * java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
     */
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("反射方法前逻辑");
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see cn.xbhou.learn.proxy.interceptor.Interceptor#around(java.lang.Object,
     * java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
     */
    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("取代了被代理对象的方法");

    }

    /*
     * (non-Javadoc)
     * 
     * @see cn.xbhou.learn.proxy.interceptor.Interceptor#after(java.lang.Object,
     * java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
     */
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("反射方法后逻辑");

    }

}
