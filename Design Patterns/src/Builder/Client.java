package Builder;

/**
 * @ProjectName: sheJiMoShi
 * @Package: Builder
 * @ClassName: Client
 * @Author: XinyuLiu
 * @Date: 2019/8/13 20:59
 */
public class Client {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        final int count = 26;
        for (int i = 0; i <count ; i++) {
            sb.append((char)('a'+i));
        }
        System.out.println(sb.toString());
    }
}
