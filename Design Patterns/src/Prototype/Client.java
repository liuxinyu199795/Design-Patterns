package Prototype;

/**
 * @ProjectName: sheJiMoShi
 * @Package: Prototype
 * @ClassName: Client
 * @Author: XinyuLiu
 * @Date: 2019/8/13 21:12
 */
public class Client {
    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype("bca");
        Prototype clone = prototype.myClone();
        System.out.println(clone);
    }
}
