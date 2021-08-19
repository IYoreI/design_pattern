package mode.template_method_4;

/**
 * @author Yore
 * @date 2021/8/13 9:49
 * @description 模板方法模式-场景类
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
