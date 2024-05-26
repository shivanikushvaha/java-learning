package week3.day18.adapter2;

import java.io.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.zip.GZIPOutputStream;

public class Main2 {
    public static void main(String[] args) {
        try (var out = new DataOutputStream(
                new BufferedOutputStream(
                        new GZIPOutputStream(
                                new FileOutputStream(
                                        "data.txt.gz"))))) {
            // write ten million random ints between 0 and 1000 to
            // data.bin.gz, compressing the file with GZIP on the fly
            ThreadLocalRandom.current().ints(10_000_000, 0, 1_000)
                    .forEach(i -> {
                        try {
                            out.writeInt(i);
                        } catch (IOException e) {
                            throw new UncheckedIOException(e);
                        }
                    });
            out.writeInt(-1); // our EOF marker
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
