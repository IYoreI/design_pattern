package mode.visitor_19;

/**
 * @author Yore
 * @date 2021/8/18 16:48
 * @description
 */
public class ConcreteElement2 extends Element{
    @Override
    public void doSomething() {
       // 完善业务逻辑
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
