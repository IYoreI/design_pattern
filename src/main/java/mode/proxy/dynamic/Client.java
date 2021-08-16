package mode.proxy.dynamic;

/**
 * @author Yore
 * @date 2021/8/16 10:01
 * @description
 */
public class Client {
    public static void main(String[] args) {
        //定义一个主题
        Subject subject = new RealSubject();
        //定义一个Handler
        MyInvocationHandler handler = new MyInvocationHandler(subject);
        //定义主题的代理类
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
        proxy.doSomething("Finish");
    }
}
