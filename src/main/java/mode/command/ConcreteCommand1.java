package mode.command;

/**
 * @author Yore
 * @date 2021/8/16 15:17
 * @description
 */
public class ConcreteCommand1 extends Command{
    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
