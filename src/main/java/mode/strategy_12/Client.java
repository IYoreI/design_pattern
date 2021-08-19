package mode.strategy_12;

/**
 * @author Yore
 * @date 2021/8/17 16:48
 * @description 策略模式-场景类
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        context.doAnything();
    }
}
