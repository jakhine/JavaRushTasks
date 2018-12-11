package com.javarush.task.task01.task0130;

/* 
Наш первый конвертер!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(40));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
          double f = (( celsium + ((32 * 5.0) / 9.0)) * 9.0) / 5;
        return f;
        //напишите тут ваш код
    }
}