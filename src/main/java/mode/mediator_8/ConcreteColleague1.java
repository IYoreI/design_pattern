package mode.mediator_8;

/**
 * @author Yore
 * @date 2021/8/16 11:26
 * @description
 */
public class ConcreteColleague1 extends Colleague {
    //通过构造函数传递中介者
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    //自有方法
    public void selfMethod1() {
        // 处理自己的业务
    }

    //依赖方法
    public void depMethod1() {
        //处理自己的业务逻辑

        //自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.doSomething1();
    }
}
