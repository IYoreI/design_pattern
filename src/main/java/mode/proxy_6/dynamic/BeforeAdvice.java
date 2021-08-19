package mode.proxy_6.dynamic;

/**
 * @author Yore
 * @date 2021/8/16 9:59
 * @description
 */
public class BeforeAdvice implements IAdvice {
    public void exec() {
        System.out.println("我是前置通知，我被执行了！");
    }
}
