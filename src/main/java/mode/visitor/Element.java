package mode.visitor;

/**
 * @author Yore
 * @date 2021/8/18 16:46
 * @description
 */
public abstract class Element {
    //定义业务逻辑
    public abstract void doSomething();

    // 允许谁来访问
    public abstract void accept(IVisitor visitor);
}
