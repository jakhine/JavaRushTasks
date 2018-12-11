package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.CharConversionException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[]input = reader.readLine().toCharArray();
        ArrayList <Character> vowels = new ArrayList<>();
        ArrayList <Character> others = new ArrayList<>();
        for (char c:input) {
            if (isVowel(c)) {
                vowels.add(c);
            } else if (c == ' '){ } else {others.add(c);}
        }
        for (char a:vowels) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (char a:others) {
            System.out.print(a + " ");
        }
        //напишите тут ваш код
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}