package AbstractFactory;

/**
 * @ProjectName: sheJiMoShi
 * @Package: AbstractFactory
 * @ClassName: ConcreteFactory2
 * @Author: XinyuLiu
 * @Date: 2019/8/13 19:44
 */
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB2();
    }
}
