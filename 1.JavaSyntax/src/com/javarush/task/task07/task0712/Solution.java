package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
                    }
        String min = list.get(0);
        String max =list.get(0);
        for (String q : list){
            if (min.length()>q.length()) min = q;
            if (max.length()<q.length() ) max = q;
        }
       if (list.indexOf(min)>list.indexOf(max)) System.out.println(max); else System.out.println(min);


             //напишите тут ваш код
    }
}
