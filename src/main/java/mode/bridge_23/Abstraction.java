package mode.bridge_23;

/**
 * @author Yore
 * @date 2021/8/19 10:06
 * @description
 */
public abstract class Abstraction {
    private Implementor imp;

    public Abstraction(Implementor imp) {
        this.imp = imp;
    }

    public void request() {
        this.imp.doSomething();
    }

    public Implementor getImp() {
        return imp;
    }

}
