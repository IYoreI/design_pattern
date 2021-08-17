package mode.decorator;

/**
 * @author Yore
 * @date 2021/8/17 16:26
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator1(component);
        component = new ConcreteDecorator2(component);
        component.operate();
    }
}