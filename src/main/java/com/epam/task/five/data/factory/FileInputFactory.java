package com.epam.task.five.data.factory;

import com.epam.task.five.data.DataAcquirer;
import com.epam.task.five.data.FileDataAcquirer;

public class FileInputFactory implements  InputFactory {
    private String inputFile;

    public FileInputFactory(String inputFile) {
        this.inputFile = inputFile;
    }

    @Override
    public DataAcquirer createDataAcquirer() {
        return new FileDataAcquirer(inputFile);
    }
}
