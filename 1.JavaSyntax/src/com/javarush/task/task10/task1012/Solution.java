package com.javarush.task.task10.task1012;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        ArrayList<String> outputList = new ArrayList<>();

        for (char alph:alphabet) {
            int i = 0;
            for (String s:list) {
            char[] chars = s.toCharArray();
            for (char ch:chars) {
                    if (ch==alph){i++; }
                   }
            }
            outputList.add(alph +" " + i);
            }

        for (String s : outputList) {
            System.out.println(s);
        }
        // напишите тут ваш код
    }

}
