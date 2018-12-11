package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] iss = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < iss.length; i++) {
            String s = reader.readLine();
            iss[i] = Integer.parseInt(s);
        }
        for (int i = iss.length - 1; i >=0 ; i--) {
            System.out.println(iss[i]);

        }

        //напишите тут ваш код
    }
}

