package commandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peng.tan on 17/8/10.
 */
public class Macro {
    private final List<Action> actions;

    public Macro() {
        this.actions = new ArrayList<>();
    }

    public void record(Action action) {
        actions.add(action);
    }

    public void run() {
        actions.forEach(Action::perform);
    }

}
