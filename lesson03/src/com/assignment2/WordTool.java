package com.assignment2;

class WordTool {


    public int lettersCount(String sentence , Boolean withSpace){
        int count = 0 ;
        if (!(sentence.isEmpty()||sentence==null))
            if (withSpace)
            {
                count = sentence.replace(" ","").length();

            }
            else
            {
                count = sentence.length();
            }

        return count;
    }

    public int wordCount(String word ){
        int count = 0;

        if (!(  word==null || word.isEmpty()))
        {
            String[] strArr = word.split(" ");

            count = strArr.length;
        }
        return count;

    }

    public int countSymbol(String word , String symbol){
        int count=0;
        if (!(symbol==null || symbol.isEmpty() ))
            if  (!(  word==null || word.isEmpty()))
            {
                String[] strArr = word.split("");
                for (String s : strArr) {
                    count = count +( s.equals(symbol) ? 1 : 0);
                }

            }
        {

        }
        return count;
    }


    public int countSymbol2 ( String s, char c ) {
        int count = 0;
        // if the entry is empty or is null, count is zero
        // therefore we evaluate it only otherwise
        if ( !(s == null || s.isEmpty()) ) {
            count = s.length() - s.replace(Character.toString(c), "").length();
        }
        return count;
    }

}







