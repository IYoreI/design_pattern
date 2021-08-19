package mode.factory_2;

/**
 * @author Yore
 * @date 2021/8/10 8:57
 * @description 工厂模式-场景类
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        /**
         * 继续后续业务逻辑处理
         */
    }
}
