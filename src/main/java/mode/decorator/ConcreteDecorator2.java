package mode.decorator;

/**
 * @author Yore
 * @date 2021/8/17 16:25
 * @description
 */
public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    /**
     * 自定义修饰方法
     */
    public void method2() {
        System.out.println("method2修饰");
    }

    /**
     * 重写父类方法
     */
    @Override
    public void operate() {
        super.operate();
        this.method2();
    }
}
