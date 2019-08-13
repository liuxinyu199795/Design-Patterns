package FactoryMethod;

/**
 * @ProjectName: sheJiMoShi
 * @Package: FactoryMethod
 * @ClassName: Factory
 * @Author: XinyuLiu
 * @Date: 2019/8/13 17:51
 * 工厂方法：定义了一个创建对象的接口，但由子类决定要实例化哪个类。工厂方法把实例化操作推迟到子类。
 *
 */
public abstract class Factory {
    public abstract Product factoryMethod();
    public void doSomething(){
        Product product =factoryMethod();
    }
}
