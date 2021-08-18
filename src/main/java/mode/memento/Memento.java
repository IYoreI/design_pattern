package mode.memento;

/**
 * @author Yore
 * @date 2021/8/18 16:15
 * @description
 */
public class Memento {
    private String state = "";
    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
