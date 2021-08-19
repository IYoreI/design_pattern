package mode.bridge_23;



/**
 * @author Yore
 * @date 2021/8/19 10:07
 * @description
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor imp) {
        super(imp);
    }

    @Override
    public void request() {
        super.request();
        super.getImp().doAnything();
    }
}
