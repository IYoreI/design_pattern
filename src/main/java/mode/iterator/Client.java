package mode.iterator;

/**
 * @author Yore
 * @date 2021/8/18 9:32
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Aggregate agg = new ConcreteAggregate();
        agg.add("abc");
        agg.add("aaa");
        agg.add("1234");

        Iterator iterator = agg.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
