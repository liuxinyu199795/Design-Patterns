package AbstractFactory;

/**
 * @ProjectName: sheJiMoShi
 * @Package: AbstractFactory
 * @ClassName: ConcreteFactory1
 * @Author: XinyuLiu
 * @Date: 2019/8/13 19:42
 */
public class ConcreteFactory1 extends AbstractFactory{
    @Override
    AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB1();
    }
}
