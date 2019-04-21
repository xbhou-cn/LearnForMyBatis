/**
 * 
 */
package cn.xbhou.learn.proxy.interceptor;

import java.lang.reflect.Method;

/**
 * @author 侯效标
 *
 */
public interface Interceptor {
    public boolean before(Object proxy, Object target, Method method, Object[] args);

    public void around(Object proxy, Object target, Method method, Object[] args);

    public void after(Object proxy, Object target, Method method, Object[] args);
}
