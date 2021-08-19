package mode.mediator_8;

/**
 * @author Yore
 * @date 2021/8/16 14:45
 * @description 通用中介者
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void doSomething1() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }

    @Override
    public void doSomething2() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
}
