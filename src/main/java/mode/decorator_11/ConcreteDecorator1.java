package mode.decorator_11;

/**
 * @author Yore
 * @date 2021/8/17 16:23
 * @description
 */
public class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    /**
     * 自定义修饰方法
     */
    public void method1() {
        System.out.println("method1 修饰");
    }

    /**
     * 重写父类方法
     */
    @Override
    public void operate() {
        this.method1();
        super.operate();
    }
}
