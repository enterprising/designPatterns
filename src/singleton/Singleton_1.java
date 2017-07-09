package singleton;

/**
 * Created by peng.tan on 17/7/9.
 * 这是最简单，最容易想到的一种实现方式   【可用】
 * 俗名又叫单例模式的饿汉式
 * 优点：实现简单，在类加载的时候就完成了实例化，避免了线程同步的问题
 * 缺点：类加载的时候就实例化了，所以没有达到懒加载的效果。要是没用的话，就造成线程的浪费了
 */
public class Singleton_1 {
    // 构造方法
    private Singleton_1() {
    }

    private static Singleton_1 uniqueInstance = new Singleton_1();

    public static Singleton_1 getInstance() {
        return uniqueInstance;
    }
}
