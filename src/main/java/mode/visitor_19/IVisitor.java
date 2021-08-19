package mode.visitor_19;

/**
 * @author Yore
 * @date 2021/8/18 16:48
 * @description 抽象访问者
 */
public interface IVisitor {
    public void visit(ConcreteElement1 el1);
    public void visit(ConcreteElement2 el2);
}
