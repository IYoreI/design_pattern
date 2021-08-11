package mode.abstract_factory;

/**
 * @author Yore
 * @date 2021/8/11 11:15
 * @description
 */
public class Creator2 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
