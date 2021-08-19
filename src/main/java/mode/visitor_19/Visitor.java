package mode.visitor_19;

/**
 * @author Yore
 * @date 2021/8/18 16:51
 * @description
 */
public class Visitor implements IVisitor{

    public void visit(ConcreteElement1 el1) {
        el1.doSomething();
    }

    public void visit(ConcreteElement2 el2) {
        el2.doSomething();
    }
}
