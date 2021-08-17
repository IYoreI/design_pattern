package mode.responsibility_chain;

/**
 * @author Yore
 * @date 2021/8/17 10:45
 * @description 责任链模式-场景类
 */
public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setNext(handler2);
        handler2.setNext(handler3);

        Response response = handler1.handleMessage(new Request());
    }
}
