package com.assignment2;

public class Main {
    public static void main(String[] args) {
        WordTool wordTool = new WordTool();
        String text = "THis is our test sentence";
        String search = "t";
        String searchCapital = "T";



        System.out.println( "Analyzing the text: \n" + text );
        System.out.println( "Total words: " + wordTool.wordCount(text) );
        System.out.println( "Total symbols (w. spaces): " + wordTool.lettersCount(text, true) );
        System.out.println( "Total symbols (wo. spaces): " + wordTool.lettersCount(text, false) );
        System.out.println( "Total amount of " + search + ": " + wordTool.countSymbol(text, search) );
        System.out.println( "Using the second method --Total amount of " + search + ": " + wordTool.countSymbol2(text, 't') );
        System.out.println( "Using the second method --Total amount of " + search + ": " + wordTool.countSymbol2(text, 'T') );

    }
}
