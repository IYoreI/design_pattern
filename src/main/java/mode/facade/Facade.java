package mode.facade;

/**
 * @author Yore
 * @date 2021/8/18 15:56
 * @description
 */
public class Facade {
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();

    //提供给外部访问的方法

    public void methodA() {
        this.a.doSomethingA();
    }

    public void methodB() {
        this.b.doSomethingB();
    }

    public void methodC() {
        this.c.doSomethingC();
    }
}
