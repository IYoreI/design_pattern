package mode.state_20;



/**
 * @author Yore
 * @date 2021/8/19 8:44
 * @description
 */
public abstract class State {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }
    public abstract void handle1();
    public abstract void handle2();
}
