package strategyPattern;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by peng.tan on 17/8/10.
 */
public class Compressor {

    private final CompressionStrategy strategy;

    public Compressor(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void compress(Path inFile, File outFile) throws FileNotFoundException {
        try (OutputStream outputStream = new FileOutputStream(outFile)) {
            Files.copy(inFile, strategy.compress(outputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
