package mode.proxy_6.dynamic;

/**
 * @author Yore
 * @date 2021/8/16 9:48
 * @description
 */
public class RealSubject implements Subject {
    public void doSomething(String str) {
        System.out.println("do something!---->" + str);
    }
}
