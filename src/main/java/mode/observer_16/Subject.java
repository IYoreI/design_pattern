package mode.observer_16;

import java.util.Vector;

/**
 * @author Yore
 * @date 2021/8/18 10:32
 * @description
 */
public abstract class Subject {
    private Vector<Observer> obsVector = new Vector<Observer>();

    public void addObserver(Observer observer) {
        this.obsVector.add(observer);
    }

    public void delObserver(Observer observer) {
        this.obsVector.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : this.obsVector) {
            observer.update();
        }
    }
}
