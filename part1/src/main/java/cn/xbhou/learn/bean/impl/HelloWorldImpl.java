/**
 * 
 */
package cn.xbhou.learn.bean.impl;

import cn.xbhou.learn.bean.IHelloWorld;

/**
 * @author 侯效标
 *
 */
public class HelloWorldImpl implements IHelloWorld {

    /* (non-Javadoc)
     * @see cn.xbhou.learn.bean.HelloWorld#sayHello(java.lang.String)
     */
    public void sayHello(String name) {
       System.out.println(name+" say Hello World");

    }

}
