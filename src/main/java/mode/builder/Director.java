package mode.builder;

/**
 * @author Yore
 * @date 2021/8/13 10:29
 * @description 导演类，起封装作用，避免高层模块深入到建造者内部的实现类
 */
public class Director {
    private Builder builder = new ConcreteBuilder();

    /**
     * 构建不同的产品
     *
     * @return
     */
    public Product getAProduct() {
        builder.setPart();
        // 设置不同的零件，产生不同的产品
        return builder.buildProduct();
    }
}
