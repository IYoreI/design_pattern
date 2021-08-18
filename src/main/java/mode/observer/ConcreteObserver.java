package mode.observer;

/**
 * @author Yore
 * @date 2021/8/18 10:35
 * @description
 */
public class ConcreteObserver implements Observer {
    public void update() {
        System.out.println("接收到信息，并进行处理");
    }
}
