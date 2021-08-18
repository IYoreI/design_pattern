package mode.adpater;

/**
 * @author Yore
 * @date 2021/8/18 8:44
 * @description 适配器角色
 */
public class Adapter extends Adaptee implements Target{
    public void request() {
        super.doSomething();
    }
}
