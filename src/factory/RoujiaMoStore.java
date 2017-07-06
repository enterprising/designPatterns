package factory;

/**
 * 工厂模式
 * 将肉夹馍store变成抽象类。相当于一个总的规范吧，之后其它地方的分店实现这个抽象类。可以理解成分店。
 * 针对每一种产品提供一种工厂类，可以通过不同的工厂创建不同的产品实例
 */
public abstract class RoujiaMoStore {

    public abstract RouJiaMo createRouJiaMo(String type);

    /**
     * @param type
     * @return
     */
    public RouJiaMo sellRouJiaMo(String type) {
        RouJiaMo rouJiaMo = createRouJiaMo(type);
        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();
        return rouJiaMo;
    }
}
