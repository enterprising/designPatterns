package singleton;

/**
 * Created by peng.tan on 17/7/9.
 * 懒汉式的 加锁。 【线程安全，但效率极低】
 * 缺点：加锁的效率太低
 */
public class Singleton_3 {
    public Singleton_3() {
    }

    public static Singleton_3 uniqueInstance = null;

    public static synchronized Singleton_3 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton_3();
        }
        return uniqueInstance;
    }
}
