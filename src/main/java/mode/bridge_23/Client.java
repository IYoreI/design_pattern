package mode.bridge_23;

/**
 * @author Yore
 * @date 2021/8/19 10:08
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Implementor imp = new ConcreteImplementor1();
        Abstraction abs = new RefinedAbstraction(imp);
        abs.request();
    }
}
