package mode.template_method;

/**
 * @author Yore
 * @date 2021/8/13 9:49
 * @description
 */
public class Client {
    public static void main(String[] args) {
        AbstractTemplate template1 = new ConcreteTemplate1();
        AbstractTemplate template2 = new ConcreteTemplate2();

        //调用模板方法
        template1.templateMethod();
        template2.templateMethod();
    }
}
