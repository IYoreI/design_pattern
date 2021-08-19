package mode.singleton_1;

/**
 * @author Yore
 * @date 2021/8/3 21:01
 * @description 枚举类实现单例模式
 */
public class SingletonEnum {
}
//获取单例的方式：
//SingletonInstance.INSTANCE.getInstance()

enum SingletonInstance {
    /**
     * 引用
     */
    INSTANCE;
    /**
     * 单例
     */
    private final SingletonEnum instance;

    SingletonInstance() {
        instance = new SingletonEnum();
    }

    public SingletonEnum getInstance() {
        return instance;
    }
}
