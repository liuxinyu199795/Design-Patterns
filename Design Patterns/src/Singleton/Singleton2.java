package Singleton;

/**
 * @ProjectName: sheJiMoShi
 * @Package: Singleton
 * @ClassName: Singleton2
 * @Author: XinyuLiu
 * @Date: 2019/8/13 10:45
 * 静态内部类（线程安全，懒汉，不能防止反射）
 * 意义：单例模式可以通过静态内部类来实现，从外部无法访问静态内部类LazyHolder，只有当调用Singleton.getInstance方法的时候，才能得到单例对象INSTANCE。
 * INSTANCE对象初始化的时机并不是在单例类Singleton被加载的时候，而是在调用getInstance方法，使得静态内部类LazyHolder被加载的时候。因此这种实现方式是利用classloader的加载机制来实现懒加载，并保证构建单例的线程安全。
 */
public class Singleton2 {
    private static class LazyHolder{
        private static final Singleton2 INSTANCE = new Singleton2();
    }

    public static Singleton2 getInstance(){
        return LazyHolder.INSTANCE;
    }
}
