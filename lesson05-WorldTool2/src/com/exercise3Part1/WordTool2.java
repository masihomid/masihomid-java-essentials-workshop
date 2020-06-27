package com.exercise3Part1;



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

        //-----
        // put all the word in a set structures so that duplicate get removed.
        Set<String> wordsSet = new HashSet<String>();
        wordsSet.addAll(wholeText);
        //get an iterator in the new created Set
        Iterator myIterator = wordsSet.iterator();

        //put the result in a map
        Map result = new HashMap();

        while(myIterator.hasNext()){
            //point to the next word on the Set
            String s = (String) myIterator.next();
            //get the amount of time this word repeated in the whole text.
            int freq = Collections.frequency(wholeText,s);
            //put the result in a map
            result.put(s,freq);

        }
        TreeMap treeMap = new TreeMap();
        //put the result map into a TreeMap so it gets sorted.
        treeMap.putAll(result);

        System.out.println(treeMap);


        System.out.println("*******************");
        System.out.println("You typed " + wholeText.size() + " words. In " + lineCount + " lines." );
        System.out.println("The number of unique words: " + wordsSet.size());
        System.out.println("*******************");
        //System.out.println(wholeText);
    }
}