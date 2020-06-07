package com.assignment1;

public class Trigonometry {


    public double calculateHypontenuse(int firstSide , int secondSide){
     return Math.hypot((double) firstSide , (double) secondSide);
    }

    public Trigonometry() {

    }

    public boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
