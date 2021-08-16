package mode.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Yore
 * @date 2021/8/16 9:49
 * @description 动态代理的Handler类
 */
public class MyInvocationHandler implements InvocationHandler {
    //被代理的对象
    private Object target = null;

    //通过构造函数传递一个对象
    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    //代理方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target, args);
    }
}
