package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
       // System.out.println(deep);
    }

    public static int getStackTraceDeep() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement e: elements             ) {System.out.println(e);}
        System.out.println(elements.length);
        return elements.length;
        //напишите тут ваш код
    }
}

