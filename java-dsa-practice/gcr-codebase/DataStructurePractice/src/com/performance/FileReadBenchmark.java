package com.performance;

import java.io.*;

public class FileReadBenchmark {
    public static void main(String[] args) throws Exception {

        String filePath = "largefile.txt"; // 100MB+ file

        BenchmarkUtils.measure("FileReader", () -> {
            try (FileReader fr = new FileReader(filePath)) {
                while (fr.read() != -1);
            } catch (IOException ignored) {}
        });

        BenchmarkUtils.measure("InputStreamReader", () -> {
            try (InputStreamReader isr =
                    new InputStreamReader(new FileInputStream(filePath))) {
                while (isr.read() != -1);
            } catch (IOException ignored) {}
        });
    }
}
