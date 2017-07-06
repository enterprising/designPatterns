package simpleFactory;

/**
 * 源代码来自 CSDN上的鸿洋_ 。在此表示感谢
 */
public class RoujamoStore {

    private SimpleRouJiaMoFactroy factroy;

    public RoujamoStore(SimpleRouJiaMoFactroy factroy)
    {
        this.factroy = factroy;
    }

    /**
     * 这是关键啊，传入一个类型，然后做肉夹馍。 这里，简单工厂模式的价值就体现出来了，现在不管你新增或者删除什么味道的肉夹馍，都和商店没有关系了。它们只负责卖，不负责处理什么种类啥的。
     * @param type
     * @return
     */
    public RouJiaMo sellRouJiaMo(String type){
        RouJiaMo rouJiaMo = factroy.createRouJiaMo(type);
        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();
        return rouJiaMo;
    }


    /**
     * 这是普通情况下，这样耦合度太高了，如果新增或者修改什么味道的话，会很麻烦。
     * @param type
     * @return
     */
    public RouJiaMo sellRouJiaMo2(String type) {
        RouJiaMo rouJiaMo = null;

        if (type.equals("Suan")) {
            rouJiaMo = new SuanRouJiaMo();
        } else if (type.equals("Tian")) {
            rouJiaMo = new TianRouJiaMo();
        } else if (type.equals("La")) {
            rouJiaMo = new LaRouJiaMo();
        }

        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();
        return rouJiaMo;
    }

}





