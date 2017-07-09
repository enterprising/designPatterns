package singleton;

/**
 * Created by peng.tan on 17/7/9.
 * 懒汉式加锁 --不安全写法 【不可用】
 */
public class Singleton_4 {
    public Singleton_4() {
    }

    public static Singleton_4 uniqueInstance = null;

    public static synchronized Singleton_4 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton_4();
        }
        return uniqueInstance;
    }
}

