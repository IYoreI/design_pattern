package mode.iterator;

import java.util.Vector;

/**
 * @author Yore
 * @date 2021/8/18 9:14
 * @description
 */
public class ConcreteIterator implements Iterator {
    private Vector vector = new Vector();
    public int cursor = 0;

    public ConcreteIterator(Vector vector) {
        this.vector = vector;
    }

    public Object next() {
        Object result = null;
        if (this.hasNext()) {
            result = this.vector.get(this.cursor++);
        }
        return result;
    }

    public boolean hasNext() {
        return this.cursor != this.vector.size();
    }

    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}
