package mode.flyweight_22;

/**
 * @author Yore
 * @date 2021/8/19 9:37
 * @description
 */
public class ConcreteFlyweight1 extends Flyweight{
    //接受外部状态
    public ConcreteFlyweight1(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        //业务逻辑
    }
}
