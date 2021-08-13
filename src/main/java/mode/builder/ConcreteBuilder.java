package mode.builder;

/**
 * @author Yore
 * @date 2021/8/13 10:27
 * @description
 */
public class ConcreteBuilder extends Builder {
    private Product product = new Product();

    @Override
    public void setPart() {
        //产品内部逻辑处理
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
