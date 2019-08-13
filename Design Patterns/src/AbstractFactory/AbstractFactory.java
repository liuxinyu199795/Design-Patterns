package AbstractFactory;

/**
 * @ProjectName: sheJiMoShi
 * @Package: AbstractFactory
 * @ClassName: AbstractFactory
 * @Author: XinyuLiu
 * @Date: 2019/8/13 19:41
 * 抽象工厂：提供一个接口，用于创建相关的对象家族。
 * 抽象工厂模式创建的是对象家族，也就是很多对象而不是一个对象，并且这些对象是相关的，也就是说必须一起创建出来。
 * 抽象工厂模式用到了工厂方法模式来创建单一对象，AbstractFactory 中的 createProductA() 和 createProductB() 方法都是让子类来实现，这两个方法单独来看就是在创建一个对象，这符合工厂方法模式的定义。
 */
public abstract class AbstractFactory {
    abstract AbstractProductA createProductA();
    abstract AbstractProductB createProductB();
}
