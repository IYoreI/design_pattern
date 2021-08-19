package mode.interpreter_21;

import java.util.Stack;

/**
 * @author Yore
 * @date 2021/8/19 9:22
 * @description 解释器模式-场景类
 */
public class Client {
    public static void main(String[] args) {
        Context ctx = new Context();
        //定义语法容器
        Stack<Expression> stack = null;
        for (; ; ) {
            //进行语法判断
        }
//        Expression exp = stack.pop();
//        exp.interpreter(ctx);
    }
}
