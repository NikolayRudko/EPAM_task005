package com.epam.task.five.processing;

import org.junit.Assert;
import org.junit.Test;


public class RegexStringProcessorTest {

    @Test
    public void processTestShouldReturnStringWithReplacedWords() {
        //given
        String origin = "Hello world java nik Mike Java";
        int lengthWord = 4;
        String replacement = "Red";
        String actual = "Hello world Red nik Red Red";
        StringProcessor processor = new RegexStringProcessor();

        //when
        String expected = processor.process(origin,replacement,lengthWord);

        //then
        Assert.assertEquals(expected,actual);
    }
}