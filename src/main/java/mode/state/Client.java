package mode.state;

/**
 * @author Yore
 * @date 2021/8/19 8:54
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentState(new ConcreteState1());
        context.handle1();
        context.handle2();
    }
}
