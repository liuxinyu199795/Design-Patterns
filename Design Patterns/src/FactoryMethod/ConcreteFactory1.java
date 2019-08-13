package FactoryMethod;

/**
 * @ProjectName: sheJiMoShi
 * @Package: FactoryMethod
 * @ClassName: ConcreteFactory1
 * @Author: XinyuLiu
 * @Date: 2019/8/13 17:55
 */
public class ConcreteFactory1 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
