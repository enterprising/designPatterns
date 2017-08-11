package strategyPattern;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Lambda表达式实现策略模式(zip算法)
 * <p>
 * Created by peng.tan on 17/8/10.
 */
public interface CompressionStrategy {
    // 定义压缩数据的策略接口
    public OutputStream compress(OutputStream data) throws IOException;
}
