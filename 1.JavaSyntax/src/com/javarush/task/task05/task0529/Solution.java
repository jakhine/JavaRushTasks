package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i=0;


        while (true){
            if(s.equals("сумма")) break;
            i= i + Integer.parseInt(s);
            s = scanner.nextLine();
        }
        System.out.println(i);
        //напишите тут ваш код
    }
}
