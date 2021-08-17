package mode.command;

/**
 * @author Yore
 * @date 2021/8/16 15:18
 * @description
 */
public class ConcreteCommand2 extends Command {
    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
