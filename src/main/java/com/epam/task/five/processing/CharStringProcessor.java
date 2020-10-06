package com.epam.task.five.processing;

public class CharStringProcessor implements StringProcessor {
    @Override
    public String process(String data, String replacement, int lengthWord) {

        char space = 0x20;
        if (data.length() == 1 && lengthWord == 1) {
            return data.charAt(0) == space ? data : replacement;
        }

        StringBuilder output = new StringBuilder("");
        int startWord = 0;
        int endWord = 0;
        if (data.charAt(0) == space) {
            output.append(data.charAt(0));
        }

        for (int i = 1; i < data.length(); i++) {


            String newWord = "";
            char current = data.charAt(i);
            char ex = data.charAt(i - 1);

            if (data.charAt(i - 1) == space && data.charAt(i) != space) {
                startWord = i;
            }

            if (data.charAt(i) == space && data.charAt(i - 1) != space) {
                endWord = i;
            }

            if (i == data.length() - 1 && data.charAt(i) != space) {
                endWord = data.length();
            }
            /*if ((data.charAt(i) == space || i == data.length() - 1) && data.charAt(i - 1) != space) {
                endWord = i;
            }*/

            if ((data.charAt(i) == space || i == data.length() - 1) && endWord >= startWord && data.charAt(i - 1) != space) {
                newWord = data.substring(startWord, endWord);

                if (newWord.length() == lengthWord) {
                    output.append(replacement);
                } else {
                    output.append(newWord);
                }

            }

            if (data.charAt(i) == space) {
                output.append(data.charAt(i));
            }
        }

        return output.toString();
    }
}
