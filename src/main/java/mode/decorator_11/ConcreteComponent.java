package mode.decorator_11;

/**
 * @author Yore
 * @date 2021/8/17 16:15
 * @description 具体构件
 */
public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("do something");
    }
}
