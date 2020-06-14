package com.exercise1;

import java.util.*;

public class WordTool2 {

    public static void main(String[] args) {
        // write your code here
        Scanner myInput = new Scanner(System.in);
        String eachLine="";
        int lineCount = -1;
        String[] wordsInEachLine;
        List<String> wholeText = new ArrayList<String>();

        while(!eachLine.equals("*")){
            eachLine = myInput.nextLine();
            wordsInEachLine =eachLine.split(" ");
            wholeText.addAll(Arrays.asList(wordsInEachLine));
            lineCount++;

        }

        System.out.println("You typed " + wholeText.size() + " words. In " + lineCount + " lines." );
        System.out.println(wholeText);
    }
}