package com.epam.task.five.processing;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharStringProcessorTest {

    @Test
    public void testProcessShouldReturnEqualSpaceString() {
        //given
        String actual = "   ";
        String origin = "   ";
        String replacement = "java";
        int lengthWord = 4;
        StringProcessor processor = new CharStringProcessor();

        //when
        String expected = processor.process(origin, replacement, lengthWord);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void processTestShouldReturnStringWithReplacedWords() {
        //given
        //String origin = "Hello world java nik Mike Java";
        String origin = "Java Java Java Java";
        int lengthWord = 4;
        String replacement = "Red";
        //String actual = "Hello world Red nik Red Red";
        String actual = "Red Red Red Red";

        StringProcessor processor = new CharStringProcessor();

        //when
        String expected = processor.process(origin, replacement, lengthWord);

        //then
        Assert.assertEquals(expected, actual);
    }
}