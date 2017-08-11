package observer_lambda;

/**
 * Created by peng.tan on 17/8/10.
 */
public class Nasa implements LandingObserver {
    @Override
    public void observeLanding(String name) {
        if (name.contains("Apollo")) {
            System.out.println("We made it!");
        }
    }
}
