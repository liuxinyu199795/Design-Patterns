package Singleton;

/**
 * @ProjectName: sheJiMoShi
 * @Package: Singleton
 * @ClassName: Singleton1
 * @Author: XinyuLiu
 * @Date: 2019/8/13 10:40
 * volatile+双重校验锁（线程安全，懒汉式，不能防止反射）
 * 意义：私有静态变量 uniqueInstance 被延迟实例化，这样做的好处是，如果没有用到该类，那么就不会实例化 uniqueInstance，从而节约资源。
 * 双重校验锁不能完全保证线程安全，因为jvm会对对象的创建三过程进行重排序（分类内存地址，创建对象，指针指向内存区域）,加上volatile后会禁止重排序，于是保证了线程安全
 * 可以通过反射获取，因为有构造器
 */
public class Singleton1 {
    private volatile static Singleton1 uniqueInstance = null;//延迟初始化
    private Singleton1(){

    }
    public static Singleton1 getSingleton1(){//需要时调用public方法初始化
        if(uniqueInstance==null){
            synchronized (Singleton1.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton1();
                }
            }
        }
        return uniqueInstance;
    }
}
