package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

import com.sun.org.apache.xpath.internal.SourceTree;

public class Solution {
    public static Cat cat;
    public static class Cat{
        public String name;
    }
    static
    {
     cat = new Cat();
     cat.name = "cat";
        System.out.println(cat.name);
    }


    public static void main(String[] args) {

    }
}
