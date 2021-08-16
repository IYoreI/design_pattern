package mode.proxy.basic;

/**
 * @author Yore
 * @date 2021/8/16 9:33
 * @description
 */
public class Proxy implements Subject {
    private Subject subject = null;

    public Proxy() {
        this.subject = new Proxy();
    }

    /**
     * 通过构造函数传递代理者
     *
     * @param subject subject
     */
    public Proxy(Subject subject) {
        this.subject = subject;
    }

    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    //预处理
    private void before() {

    }

    //善后处理
    public void after() {

    }
}
