package FactoryMethod;

/**
 * @ProjectName: sheJiMoShi
 * @Package: FactoryMethod
 * @ClassName: ConcreteFactory
 * @Author: XinyuLiu
 * @Date: 2019/8/13 17:55
 * 子类实现抽象方法自己选择想要实例化的类
 */
public class ConcreteFactory extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
