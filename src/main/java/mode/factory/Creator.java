package mode.factory;

/**
 * @author Yore
 * @date 2021/8/10 8:52
 * @description 抽象工厂类
 */
public abstract class Creator {
    /**
     * 创建一个产品对象
     * @param c
     * @param <T>
     * @return
     */
    public abstract <T extends Product> T createProduct(Class<T> c);
}
