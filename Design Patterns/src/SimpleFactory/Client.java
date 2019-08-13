package SimpleFactory;

/**
 * @ProjectName: sheJiMoShi
 * @Package: SimpleFactory
 * @ClassName: Client
 * @Author: XinyuLiu
 * @Date: 2019/8/13 11:32
 * 简单工厂模式：在创建一个对象时不向客户暴露内部细节，并提供一个创建对象的通用接口。
 * 意义：简单工厂把实例化的操作单独放到一个类中，这个类就成为简单工厂类（SimpleFactory），让简单工厂类来决定应该用哪个具体子类来实例化。
 * 这样做能把客户类和具体子类的实现解耦，客户类不再需要知道有哪些子类以及应当实例化哪个子类。
 * 客户类往往有多个，如果不使用简单工厂，那么所有的客户类都要知道所有子类的细节。而且一旦子类发生改变，例如增加子类，那么所有的客户类都要进行修改。
 */
public class Client {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product=simpleFactory.createProduct(1);//不对外暴露方法，提供一个通用创建方法createProduct()
    }
}
