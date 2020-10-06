package com.epam.task.five.view;

public class ConsoleResultPrinter implements ResultPrinter {
    @Override
    public void print(String data) {
        System.out.println(data);
    }
}
