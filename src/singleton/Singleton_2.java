package singleton;

/**
 * Created by peng.tan on 17/7/9.
 * 单例模式的懒汉式写法       【线程不安全，不可用】
 */
public class Singleton_2 {
    public Singleton_2() {

    }

    public static Singleton_2 uniqueInstance = null;

    public static Singleton_2 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton_2();
        }
        return uniqueInstance;
    }
}
