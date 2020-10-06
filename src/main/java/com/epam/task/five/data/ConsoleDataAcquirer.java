package com.epam.task.five.data;

import java.util.Scanner;

public class ConsoleDataAcquirer implements DataAcquirer {
    @Override
    public String getData() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string.");

        return scanner.nextLine();
    }
}
