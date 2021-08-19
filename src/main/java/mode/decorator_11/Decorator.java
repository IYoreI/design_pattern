package mode.decorator_11;

/**
 * @author Yore
 * @date 2021/8/17 16:17
 * @description 抽象装饰者
 */
public abstract class Decorator extends Component {
    private Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}
