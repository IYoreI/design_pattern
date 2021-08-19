package mode.mediator_8;

/**
 * @author Yore
 * @date 2021/8/16 11:25
 * @description
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
