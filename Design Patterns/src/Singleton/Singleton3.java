package Singleton;

/**
 * @ProjectName: sheJiMoShi
 * @Package: Singleton
 * @ClassName: Singleton3
 * @Author: XinyuLiu
 * @Date: 2019/8/13 10:49
 * 枚举类（线程安全，饿汉式，可以防止反射）
 * 意义：使用枚举实现的单例模式，不但可以防止利用反射强行构建单例对象，而且可以在枚举类对象被反序列化的时候，保证反序列的返回结果是同一对象。
 */
public enum Singleton3 {
    INSTANCE;
}
