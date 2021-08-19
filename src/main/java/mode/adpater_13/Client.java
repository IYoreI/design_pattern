package mode.adpater_13;

/**
 * @author Yore
 * @date 2021/8/18 8:44
 * @description 适配器模式-场景类
 */
public class Client {
    public static void main(String[] args) {
        //原有业务逻辑
        Target target = new ConcreteTarget();
        target.request();
        //现在增加了适配器角色
        Target target2 = new Adapter();
        target2.request();
    }
}
