package mode.template_method_4;

/**
 * @author Yore
 * @date 2021/8/13 9:41
 * @description
 */
public abstract class AbstractTemplate {
    /**
     * 基本方法
     */
    protected abstract void doSomething();

    /**
     * 基本方法
     */
    protected abstract void doAnything();

    /**
     * 按照固定的逻辑调用基本方法
     */
    public void templateMethod() {
        this.doSomething();
        this.doAnything();
    }
}
