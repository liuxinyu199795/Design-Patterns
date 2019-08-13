package Prototype;

/**
 * @ProjectName: sheJiMoShi
 * @Package: Prototype
 * @ClassName: ConcretePrototype
 * @Author: XinyuLiu
 * @Date: 2019/8/13 21:11
 */
public class ConcretePrototype extends Prototype{
    private String filed;

    public ConcretePrototype(String filed) {
        this.filed = filed;
    }

    @Override
    Prototype myClone() {
        return new ConcretePrototype(filed);
    }

    @Override
    public String toString() {
        return filed;
    }
}
