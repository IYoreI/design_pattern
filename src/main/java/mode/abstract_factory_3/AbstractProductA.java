package mode.abstract_factory_3;

/**
 * @author Yore
 * @date 2021/8/11 11:09
 * @description
 */
public abstract class AbstractProductA {
    // 每个产品共有的方法
    public void shareMethod() {
    }

    // 每个产品相同的方法，不同的实现
    public abstract void doSomething();
}
