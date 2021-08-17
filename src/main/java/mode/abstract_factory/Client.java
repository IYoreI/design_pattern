package mode.abstract_factory;

/**
 * @author Yore
 * @date 2021/8/11 11:16
 * @description 抽象工厂模式-场景类
 */
public class Client {
    public static void main(String[] args) {
        //定义两个工厂
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();

        AbstractProductA a1 = creator1.createProductA();
        AbstractProductA a2 = creator2.createProductA();

        AbstractProductB b1 = creator1.createProductB();
        AbstractProductB b2 = creator2.createProductB();

    }
}
