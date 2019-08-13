package Singleton;

/**
 * @ProjectName: sheJiMoShi
 * @Package: Singleton
 * @ClassName: Singleton2
 * @Author: XinyuLiu
 * @Date: 2019/8/13 10:45
 * 饿汉式-线程安全
 * 意义：线程不安全问题主要是由于 uniqueInstance 被实例化多次，采取直接实例化 uniqueInstance 的方式就不会产生线程不安全问题。
 * 但是直接实例化的方式也丢失了延迟实例化带来的节约资源的好处。
 */
public class Singleton2 {
    private static Singleton2 uniqueInstance = new Singleton2();
}
