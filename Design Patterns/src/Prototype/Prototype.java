package Prototype;

/**
 * @ProjectName: sheJiMoShi
 * @Package: Prototype
 * @ClassName: Prototype
 * @Author: XinyuLiu
 * @Date: 2019/8/13 21:06
 * 原型模式：使用原型实例指定要创建对象的类型，通过复制这个原型来创建新对象。
 */
public abstract class Prototype {
    abstract Prototype myClone();
}
