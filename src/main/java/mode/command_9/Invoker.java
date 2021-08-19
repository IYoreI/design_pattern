package mode.command_9;

/**
 * @author Yore
 * @date 2021/8/16 15:19
 * @description
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
