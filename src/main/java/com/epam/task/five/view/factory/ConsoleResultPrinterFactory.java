package com.epam.task.five.view.factory;

import com.epam.task.five.view.ConsoleResultPrinter;
import com.epam.task.five.view.ResultPrinter;

public class ConsoleResultPrinterFactory implements ResultPrinterFactory {
    @Override
    public ResultPrinter createPrinter() {
        return new ConsoleResultPrinter();
    }
}
