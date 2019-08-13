package Singleton;

/**
 * @ProjectName: sheJiMoShi
 * @Package: Singleton
 * @ClassName: Singleton1
 * @Author: XinyuLiu
 * @Date: 2019/8/13 10:40
 * 懒汉式-线程不安全
 * 意义：私有静态变量 uniqueInstance 被延迟实例化，这样做的好处是，如果没有用到该类，那么就不会实例化 uniqueInstance，从而节约资源。
 * 这个实现在多线程环境下是不安全的，如果多个线程能够同时进入 if (uniqueInstance == null) ，并且此时 uniqueInstance 为 null，
 * 那么会有多个线程执行 uniqueInstance = new Singleton(); 语句，这将导致实例化多次 uniqueInstance。
 */
public class Singleton1 {
    private static Singleton1 uniqueInstance;//延迟初始化
    private Singleton1(){

    }
    public static Singleton1 getSingleton1(){//需要时调用public方法初始化
        if(uniqueInstance==null){
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;
    }
}
