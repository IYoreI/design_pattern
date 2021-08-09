package mode.singleton;

/**
 * @author Yore
 * @date 2021/8/3 20:36
 * @description 懒汉式单例模式实现
 * 为了实现在第一次使用的时候再创建实例，可以考虑使用懒汉式的方式实现
 */
public class SingletonLazy {
}

/**
 * 线程不安全的实现
 */
class SingletonLazy1 {
    private static SingletonLazy1 INSTANCE;

    private SingletonLazy1() {
    }

    /**
     * 在使用时判断是否实例化，如果存在则直接返回实例，不存在则创建实例
     * 该方法存在线程安全的问题，如果多线程同时调用，可能会出现初始化多个实例的现象。
     */
    public static SingletonLazy1 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonLazy1();
        }
        return INSTANCE;
    }
}

/**
 * 线程安全的实现，效率不高
 */
class SingletonLazy2 {
    private static SingletonLazy2 INSTANCE;

    private SingletonLazy2() {
    }

    /**
     * 通过synchronized关键字来实现线程安全的方法，但是效率会降低
     */
    public static synchronized SingletonLazy2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonLazy2();
        }
        return INSTANCE;
    }
}

/**
 * 双重检查实现： 线程安全，效率高
 */
class SingletonLazy3 {
    private static SingletonLazy3 INSTANCE;

    private SingletonLazy3() {
    }

    /**
     * 通过synchronized关键字来实现线程安全的方法，但是效率会降低
     */
    public static SingletonLazy3 getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonLazy3.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonLazy3();
                }
            }
        }
        return INSTANCE;
    }
}

/**
 * 静态内部类实现： 懒加载，线程安全，效率高【推荐使用】
 */

class SingletonLazy4 {
    private SingletonLazy4() {
    }

    /**
     * 该方法实现和饿汉式类似，采用类加载机制来实现，但是静态内部类在类加载时并不会实例化，而是在需要的时候才实例化
     * 进一步实现了懒加载的效果
     */
    private static class SingletonInstance {
        private static final SingletonLazy4 INSTANCE = new SingletonLazy4();
    }

    public static SingletonLazy4 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
