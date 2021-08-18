package mode.observer;

/**
 * @author Yore
 * @date 2021/8/18 10:36
 * @description 观察者模式-场景类
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer obs = new ConcreteObserver();
        subject.addObserver(obs);
        subject.doSomething();
    }
}
