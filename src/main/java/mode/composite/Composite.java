package mode.composite;

import java.util.ArrayList;

/**
 * @author Yore
 * @date 2021/8/18 9:54
 * @description
 */
public class Composite extends Component {
    private ArrayList<Component> componentArrayList = new ArrayList<Component>();

    public void add(Component component) {
        this.componentArrayList.add(component);
    }

    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }

    public ArrayList<Component> getChildren() {
        return this.componentArrayList;
    }
}
