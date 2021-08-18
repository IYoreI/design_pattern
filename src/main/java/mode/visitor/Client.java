package mode.visitor;

/**
 * @author Yore
 * @date 2021/8/18 16:53
 * @description 访问者模式-场景类
 */
public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Element e1 = ObjectStruture.createElement();
            e1.accept(new Visitor());
        }
    }
}
