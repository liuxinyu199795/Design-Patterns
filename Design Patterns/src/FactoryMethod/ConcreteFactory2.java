package FactoryMethod;

/**
 * @ProjectName: sheJiMoShi
 * @Package: FactoryMethod
 * @ClassName: ConcreteFactory2
 * @Author: XinyuLiu
 * @Date: 2019/8/13 17:56
 */
public class ConcreteFactory2 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
