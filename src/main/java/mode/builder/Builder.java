package mode.builder;

/**
 * @author Yore
 * @date 2021/8/13 10:25
 * @description
 */
public abstract class Builder {
    //不同产品可以设置自己的特点
    public abstract void setPart();
    // 建造产品
    public abstract Product buildProduct();
}
