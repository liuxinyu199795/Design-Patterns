package Builder;

/**
 * @ProjectName: sheJiMoShi
 * @Package: Builder
 * @ClassName: StringBuilder
 * @Author: XinyuLiu
 * @Date: 2019/8/13 20:56
 */
public class StringBuilder extends AbstractStringBuilder {
    public StringBuilder() {
        super(16);
    }
    @Override
    public String toString(){
        return new String(value,0,count);
    }
}
