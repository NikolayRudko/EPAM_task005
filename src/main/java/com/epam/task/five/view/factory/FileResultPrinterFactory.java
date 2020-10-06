package com.epam.task.five.view.factory;

import com.epam.task.five.view.FileResultPrinter;
import com.epam.task.five.view.ResultPrinter;

public class FileResultPrinterFactory implements ResultPrinterFactory {

    private String outputFile;

    public FileResultPrinterFactory(String outputFile) {
        this.outputFile = outputFile;
    }

    @Override
    public ResultPrinter createPrinter() {
        return new FileResultPrinter(outputFile);
    }
}
