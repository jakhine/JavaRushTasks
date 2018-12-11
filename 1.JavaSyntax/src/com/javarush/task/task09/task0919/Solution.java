package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        

        try {
            divisionByZero();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void divisionByZero() {
        System.out.println(Math.random()*3/0);

    }
}