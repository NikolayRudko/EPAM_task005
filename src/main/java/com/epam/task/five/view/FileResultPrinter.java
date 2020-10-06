package com.epam.task.five.view;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileResultPrinter implements ResultPrinter {
    private String outputFile;

    public FileResultPrinter(String outputFile) {
        this.outputFile = outputFile;
    }

    @Override
    public void print(String data) {
        File file = new File(outputFile);
        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.printf("%s ", data);
        } catch (IOException e) {
            System.out.printf("An exception occurs %s", e.getMessage());
        }
    }
}
