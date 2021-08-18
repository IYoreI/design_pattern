package mode.memento;

/**
 * @author Yore
 * @date 2021/8/18 16:17
 * @description 备忘录模式-场景类
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        //创建一个备忘录
        careTaker.setMemento(originator.createMemento());
        //恢复一个备忘录
        originator.restoreMemneto(careTaker.getMemento());
    }
}
