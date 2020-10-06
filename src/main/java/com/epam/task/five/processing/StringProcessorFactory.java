package com.epam.task.five.processing;

public class StringProcessorFactory {
    public StringProcessor stringProcessorCreator(StringProcessorType type) {
        switch (type) {
            case CHAR:
                return new CharStringProcessor();
            case REGEX:
                return new RegexStringProcessor();
            default:
                throw new IllegalArgumentException("Unknown data type.");
        }
    }
}
