package com.exercise3Part2;

import java.util.Comparator;

public class SortNodesByValue implements Comparator<EachNode> {

    // Used for sorting in ascending order
    public int compare(EachNode a, EachNode b)
    {
        return a.value - b.value;
    }
}