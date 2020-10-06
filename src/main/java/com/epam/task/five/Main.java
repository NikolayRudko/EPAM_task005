package com.epam.task.five;


import com.epam.task.five.data.DataAcquirer;
import com.epam.task.five.data.factory.ConsoleInputFactory;
import com.epam.task.five.data.factory.FileInputFactory;
import com.epam.task.five.data.factory.InputFactory;
import com.epam.task.five.processing.StringProcessor;
import com.epam.task.five.processing.StringProcessorFactory;
import com.epam.task.five.processing.StringProcessorType;
import com.epam.task.five.view.ResultPrinter;
import com.epam.task.five.view.factory.ConsoleResultPrinterFactory;
import com.epam.task.five.view.factory.FileResultPrinterFactory;
import com.epam.task.five.view.factory.ResultPrinterFactory;


public class Main {
    private static final int LENGTH_WORD = 4;
    private static final String REPLACEMENT = "Sun";
    private static final String INPUT_FILE = "input.txt";
    private static final String OUTPUT_FILE_FIRST = "outputFirst.txt";
    private static final String OUTPUT_FILE_SECOND = "outputSecond.txt";

    public static void main(String[] args) {
        //input
        InputFactory consoleInputFactory = new ConsoleInputFactory();
        InputFactory fileInputFactory = new FileInputFactory(INPUT_FILE);
        DataAcquirer consoleDataAcquirer = consoleInputFactory.createDataAcquirer();
        DataAcquirer fileDataAcquirer = fileInputFactory.createDataAcquirer();
        String originString = fileDataAcquirer.getData();

        //processing
        StringProcessorFactory stringProcessorFactory = new StringProcessorFactory();
        StringProcessor stringProcessorRegex = stringProcessorFactory.stringProcessorCreator(StringProcessorType.REGEX);
        StringProcessor stringProcessorChar = stringProcessorFactory.stringProcessorCreator(StringProcessorType.CHAR);

        String outputFirst = stringProcessorRegex.process(originString, REPLACEMENT, LENGTH_WORD);
        String outputSecond = stringProcessorChar.process(originString, REPLACEMENT, LENGTH_WORD);

        //output

        ResultPrinterFactory consoleResultPrinterFactory = new ConsoleResultPrinterFactory();
        ResultPrinter consoleResultPrinter = consoleResultPrinterFactory.createPrinter();

        ResultPrinterFactory firstFileResultPrinterFactory = new FileResultPrinterFactory(OUTPUT_FILE_FIRST);
        ResultPrinter firstFileResultPrinter = firstFileResultPrinterFactory.createPrinter();

        ResultPrinterFactory secondFileResultPrinterFactory = new FileResultPrinterFactory(OUTPUT_FILE_SECOND);
        ResultPrinter secondFileResultPrinter = secondFileResultPrinterFactory.createPrinter();

        firstFileResultPrinter.print(outputFirst);
        secondFileResultPrinter.print(outputSecond);

        consoleResultPrinter.print(outputFirst);
        consoleResultPrinter.print(outputSecond);
    }
}
