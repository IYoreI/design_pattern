package mode.state_20;

/**
 * @author Yore
 * @date 2021/8/19 8:46
 * @description
 */
public class ConcreteState1 extends State{
    @Override
    public void handle1() {
       //本状态下必须处理的逻辑
    }

    @Override
    public void handle2() {
        super.context.setCurrentState(Context.STATE2);
        super.context.handle2();
    }
}
