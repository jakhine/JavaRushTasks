package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
        int i = scanner.nextInt();
        double a =0;
        double c =0;

        while (i!=-1) {
            c++;
            a = (i +a);
           i = scanner.nextInt();
        }
        System.out.println(a/c);



                //напишите тут ваш код
    }
}

