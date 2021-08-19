package mode.prototype_7;

/**
 * @author Yore
 * @date 2021/8/16 10:25
 * @description
 */
public class PrototypeClass implements Cloneable {
    @Override
    public PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
