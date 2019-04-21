package cn.xbhou.learn.reflect;

public class ReflectServiceImpl {
    public void say() {
        System.out.println("Hello World");
    }

    public static ReflectServiceImpl newInstance() {
        ReflectServiceImpl impl = null;
        try {
            try {
                impl = (ReflectServiceImpl) Class.forName("cn.xbhou.learn.reflect.ReflectServiceImpl").newInstance();
            } catch (InstantiationException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return impl;
    }
}
