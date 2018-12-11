package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[]array = s.toCharArray();
        array[0] = Character.toUpperCase(array[0]);
       for (int i = 0; i < array.length; i++) {
           if (array[i] == ' '&(i!=array.length-1))
            array[i+1] = Character.toUpperCase(array[i+1]);
                   }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]);
        }


        //напишите тут ваш код
    }
}
