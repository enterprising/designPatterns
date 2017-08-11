package observer_lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peng.tan on 17/8/10.
 * <p>
 * 被观察者
 */
public class Moon {
    private final List<LandingObserver> observers = new ArrayList<>();

    public void land(String name) {
        for (LandingObserver observer : observers) {
            observer.observeLanding(name);
        }
    }

    public void startSpying(LandingObserver observer) {
        observers.add(observer);
    }

}
