package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream input = new FileInputStream(reader.readLine());
            int count = 0;
        while(input.available()>0){
            if (input.read()==',') count++;
        }
        input.close();
        System.out.println(count);
    }
}
