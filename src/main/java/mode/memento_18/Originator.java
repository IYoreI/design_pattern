package mode.memento_18;

/**
 * @author Yore
 * @date 2021/8/18 16:14
 * @description
 */
public class Originator {
    //ει¨ηΆζ
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void restoreMemneto(Memento memento) {
        this.setState(memento.getState());
    }
}
