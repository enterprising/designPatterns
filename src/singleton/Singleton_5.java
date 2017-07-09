package singleton;

/**
 * Created by peng.tan on 17/7/9.
 * 懒汉式的双重加锁 【线程安全， 推荐用】
 * 保证了延迟加载和线程安全
 */
public class Singleton_5 {

    public Singleton_5() {
    }

    public static Singleton_5 uniqueInstance = null;

    public static synchronized Singleton_5 getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton_5.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton_5();
                }
            }
        }
        return uniqueInstance;
    }
}
