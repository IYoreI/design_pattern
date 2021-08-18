package mode.iterator;

/**
 * @author Yore
 * @date 2021/8/18 9:19
 * @description 抽象容器
 */
public interface Aggregate {
    //容器中增加元素
    public void add(Object object);
    //容器中减少元素
    public void remove(Object object);
    //迭代器遍历元素
    public Iterator iterator();
}
