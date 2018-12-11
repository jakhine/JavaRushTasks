package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/


import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class StringHelper {
    public static String multiply(String s) {
        String result =s;
        for (int i=1; i<5; i++) result = result+s;
          //напишите тут ваш код
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        for (int i=0; i<count; i++)
            result = result+s;

        //напишите тут ваш код
        return result;
    }

    public static void main(String[] args) {

//        System.out.println(multiply("sda@",12));
//        System.out.println( multiply("asdO"));

    }
}
