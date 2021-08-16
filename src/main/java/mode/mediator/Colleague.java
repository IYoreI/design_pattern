package mode.mediator;

import java.util.Collections;

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
