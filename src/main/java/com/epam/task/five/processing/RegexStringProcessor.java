package com.epam.task.five.processing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexStringProcessor implements StringProcessor {
    @Override
    public String process(String data, String replacement, int lengthWord) {
        String pattern = String.format("\\b\\w{%d,%d}\\b", lengthWord, lengthWord);
        Pattern wordPattern = Pattern.compile(pattern);
        Matcher matcher = wordPattern.matcher(data);
        return matcher.replaceAll(replacement);
    }
}
