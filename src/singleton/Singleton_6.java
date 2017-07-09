package singleton;

/**
 * Created by peng.tan on 17/7/9.
 * 单例模式 的 内部类实现 【这里是 JVM帮我们实现线程安全，建议用】
 */
public class Singleton_6 {
    private Singleton_6() {
    }

    private static class SingletonHolder {
        private static Singleton_6 instance = new Singleton_6();
    }

    public static Singleton_6 getInstance() {
        return SingletonHolder.instance;
    }
}
