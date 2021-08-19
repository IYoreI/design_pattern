package mode.strategy_12;

/**
 * @author Yore
 * @date 2021/8/17 16:46
 * @description
 */
public class Context {
    private Strategy strategy = null;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doAnything() {
        this.strategy.doSomething();
    }
}
