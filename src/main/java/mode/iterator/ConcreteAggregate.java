package mode.iterator;

import java.util.Vector;

/**
 * @author Yore
 * @date 2021/8/18 9:31
 * @description
 */
public class ConcreteAggregate implements Aggregate {
    private Vector vector = new Vector();

    public void add(Object object) {
        this.vector.add(object);
    }

    public void remove(Object object) {
        this.remove(object);
    }

    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
}
