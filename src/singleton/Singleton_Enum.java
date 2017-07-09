package singleton;

/**
 * Created by peng.tan on 17/7/9.
 * 单例模式 枚举 实现。 这是高级玩法。  【及其建议用】
 * 借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 * 外部访问方式：Singleton_Enum.instance.method();
 */
public enum Singleton_Enum {
    instatnce;

    private Singleton_Enum() {
    }

    public void method() {
    }
}
