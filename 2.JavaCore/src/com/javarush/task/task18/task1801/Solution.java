package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream  input = new FileInputStream(reader.readLine());
        int maxByte = 0;

        while(input.available()>0) {
            int current = input.read();
            maxByte = current>maxByte?current:maxByte;

        }
        input.close();
        System.out.println(maxByte);
    }
}
