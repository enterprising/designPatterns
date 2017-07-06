package factory;

/**
 * 这里还是用简单工厂的方法实现。 西安分店，这里可以理解成，它有自己特色风味的一些东西，可以有自己的特色。
 */
public class XianSimpleRoujiaMoFactory extends RoujiaMoStore {

    @Override
    public RouJiaMo createRouJiaMo(String type) {
        RouJiaMo roujiaMo = null;
        switch (type) {
            case "Suan":
                roujiaMo = new SuanRouJiaMo();
                break;
            case "La":
                roujiaMo = new LaRouJiaMo();
                break;
            case "Tian":
                roujiaMo = new TianRouJiaMo();
                break;
            default:// 默认为酸肉夹馍
                roujiaMo = new SuanRouJiaMo();
                break;
        }
        return roujiaMo;
    }
}
