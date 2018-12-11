package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;
/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String s = reader.readLine();
                int i = Integer.parseInt(s);
                  while (i>0) {
                      if (i%2 ==0) even++;
                      else odd++;
                      i=i/10;
                }
        System.out.println("Even: " + even +" " + "Odd: " + odd);
    }
}
