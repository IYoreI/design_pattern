package mode.state;

/**
 * @author Yore
 * @date 2021/8/19 8:46
 * @description
 */
public class ConcreteState2 extends State {
    @Override
    public void handle1() {
        super.context.setCurrentState(Context.STATE1);
        super.context.handle1();
    }

    @Override
    public void handle2() {
        //本状态下必须处理的逻辑
    }
}
