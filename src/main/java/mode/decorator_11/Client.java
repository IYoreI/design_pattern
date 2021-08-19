package mode.decorator_11;

/**
 * @author Yore
 * @date 2021/8/17 16:26
 * @description 装饰模式-场景类
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator1(component);
        component = new ConcreteDecorator2(component);
        component.operate();
    }
}
