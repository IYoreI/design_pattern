package mode.abstract_factory_3;

/**
 * @author Yore
 * @date 2021/8/11 11:13
 * @description
 */
public abstract class AbstractCreator {
    //构建A产品家族
    public abstract AbstractProductA createProductA();
    //构建B产品家族
    public abstract AbstractProductB createProductB();
}
