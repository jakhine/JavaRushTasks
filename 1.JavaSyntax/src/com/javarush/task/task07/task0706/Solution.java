package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
          int sumOdd = 0;
        int [] str = new int[15];
        int sumEven = str[0];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < str.length; i++) {
            String s = reader.readLine();
            str[i] = Integer.parseInt(s);
            }

        for (int i = 1; i<str.length ; i++) {
            if (i%2==0) sumEven += str[i];
            else sumOdd += str[i];
        }
        if (sumEven < sumOdd) System.out.println("В домах с нечетными номерами проживает больше жителей." );
        else System.out.println("В домах с четными номерами проживает больше жителей.");




        //напишите тут ваш код
    }
}
