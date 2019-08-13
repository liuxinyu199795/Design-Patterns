package SimpleFactory;

/**
 * @ProjectName: sheJiMoShi
 * @Package: SimpleFactory
 * @ClassName: SimpleFactory
 * @Author: XinyuLiu
 * @Date: 2019/8/13 11:28
 */
public class SimpleFactory {
    public Product createProduct(int type){
        if(type==1){
            return new ConcreteProduct1();
        }else if(type==2){
            return new ConcreteProduct2();
        }
        return new ConcreteProduct();
    }
}
