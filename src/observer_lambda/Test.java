package observer_lambda;

/**
 * Created by peng.tan on 17/8/10.
 */
public class Test {
    public static void main(String[] args) {
        Moon moon = new Moon();
        moon.startSpying(new Nasa());
        moon.startSpying(new Aliens());
        moon.land("An asteroid");
        moon.land("Apollo 11");

    }

    public static void main2(String[] args) {
        Moon moon = new Moon();

        moon.startSpying(name -> {
            if (name.contains("Apollo"))
                System.out.println("We made it!");
        });
        moon.startSpying(name -> {
            if (name.contains("Apollo"))
                System.out.println("They're distracted, lets invade earth!");
        });
        moon.land("An asteroid");
        moon.land("Apollo 11");
    }
}
