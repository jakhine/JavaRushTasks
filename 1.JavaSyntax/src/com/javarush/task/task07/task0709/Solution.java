package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.SyncFailedException;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5 ; i++) {
           list.add(bufferedReader.readLine());
        }
        String min = list.get(0);
        for (String s : list) {
           if (min.length()> s.length())
               min = s;
                    }
        for (String s :list) {
            if (min.length() == s.length()) System.out.println(s);
        }
               }
        //напишите тут ваш код
    }

