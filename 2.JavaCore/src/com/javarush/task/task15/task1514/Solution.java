package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static
    {
        labels.put(123.0, "GHBDTN");
        labels.put(122d, "GHBD234TN");
        labels.put(121d, "GHBdfghDTN");
        labels.put(120d, "GHBdghDTN");
        labels.put(124d, "GHBdghDTgggN");

    }


    public static void main(String[] args) {
        System.out.println(labels);
    }
}
