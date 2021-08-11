package mode.abstract_factory;

/**
 * @author Yore
 * @date 2021/8/11 11:14
 * @description
 */
public class Creator1 extends AbstractCreator{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
