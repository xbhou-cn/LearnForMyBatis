package ssm_learn.part1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

import cn.xbhou.learn.bean.IHelloWorld;
import cn.xbhou.learn.bean.impl.HelloWorldImpl;
import cn.xbhou.learn.proxy.InterceptorJdkProxy;
import cn.xbhou.learn.reflect.ReflectServiceImpl;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void test01() {
        ReflectServiceImpl impl = ReflectServiceImpl.newInstance();
        try {
            Method method = impl.getClass().getMethod("say");
            method.invoke(impl);
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void test02() {
        IHelloWorld impl = (IHelloWorld) InterceptorJdkProxy.bind(new HelloWorldImpl(),
                "cn.xbhou.learn.proxy.interceptor.MyInterceptor");
                impl.sayHello("赵玉芹");
    }
}
