package Singleton;

/**
 * @ProjectName: sheJiMoShi
 * @Package: Singleton
 * @ClassName: Singleton5
 * @Author: XinyuLiu
 * @Date: 2019/8/13 11:09
 * 静态内部类-线程安全
 * 意义:当 Singleton 类被加载时，静态内部类 SingletonHolder 没有被加载进内存。
 * 只有当调用 getSingleton() 方法从而触发 SingletonHolder.INSTANCE 时 SingletonHolder 才会被加载，此时初始化 INSTANCE 实例，
 * 并且 JVM 能确保 INSTANCE 只被实例化一次。
 * 这种方式不仅具有延迟初始化的好处，而且由 JVM 提供了对线程安全的支持。
 */
public class Singleton5 {
    private Singleton5(){}

    private static class SingletonHolder{
        private static Singleton5 uniqueInstance = new Singleton5();
    }

    public static Singleton5 getSingleton(){
        return SingletonHolder.uniqueInstance;
    }

}
