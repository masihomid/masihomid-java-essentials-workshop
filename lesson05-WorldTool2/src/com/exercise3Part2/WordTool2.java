package com.exercise3Part2;



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
        //Map result = new HashMap();
        List<EachNode> resultList = new ArrayList<EachNode>();

        while(myIterator.hasNext()){
            //point to the next word on the Set
            String s = (String) myIterator.next();
            //get the amount of time this word repeated in the whole text.
            int freq = Collections.frequency(wholeText,s);
            //put the result in a map
            //result.put(s,freq);
            resultList.add(new EachNode(s,freq));
            //System.out.println(s + " was repeated " + freq + " times." );
        }

        //use Collections.sort for sorting your List
//
        Collections.sort(resultList,new SortNodesByValue());




        for (int i = 0; i < resultList.size(); i++) {
            System.out.print("The word "+resultList.get(i).key);
            System.out.println(" is repeated. " + resultList.get(i).value);

        }


        System.out.println("*******************");
        System.out.println("You typed " + wholeText.size() + " words. In " + lineCount + " lines." );
        System.out.println("The number of unique words: " + wordsSet.size());
        System.out.println("*******************");
        //System.out.println(wholeText);
    }
}