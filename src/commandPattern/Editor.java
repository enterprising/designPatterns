package commandPattern;

/**
 *
 * 用Lambda表达式实现命令模式，这种实现更简单更方便
 * 这里只有命令模式的代码，具体调用需要另外实现
 *
 * Created by peng.tan on 17/8/10.
 */
public interface Editor {

    public void save();

    public void open();

    public void close();

}
