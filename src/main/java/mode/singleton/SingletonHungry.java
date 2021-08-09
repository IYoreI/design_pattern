package mode.singleton;

/**
 * @author Yore
 * @date 2021/8/3 20:37
 * @description 饿汉式单例模式实现
 * 1. 使用静态常量实现
 * 2. 使用静态代码块实现
 * <p>
 * 优点: 类加载的时候完成实例化，避免了线程同步问题
 * 缺点：不管使用与否，都会创建，造成内存浪费
 */
public class SingletonHungry {
}

class SingletonHungry1 {
    // 方式1： 静态常量
    private final static SingletonHungry1 INSTANCE = new SingletonHungry1();

    private SingletonHungry1() {
    }

    public static SingletonHungry1 getInstance() {
        return INSTANCE;
    }
}


class SingletonHungry2 {
    //方式2: 静态代码块
    private static final SingletonHungry2 INSTANCE;

    static {
        INSTANCE = new SingletonHungry2();
    }

    private SingletonHungry2() {
    }

    public static SingletonHungry2 getInstance() {
        return INSTANCE;
    }
}