package mode.observer;

/**
 * @author Yore
 * @date 2021/8/18 10:35
 * @description
 */
public class ConcreteSubject extends Subject {
    public void doSomething() {
        super.notifyObservers();
    }
}
