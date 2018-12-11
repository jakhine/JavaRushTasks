package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <Integer>  arrayList = new ArrayList<>();
        try {
            InputStream inputStream = new FileInputStream(reader.readLine());
            while (inputStream.available()>0 ){
                 if ((char)inputStream.read()%2==0 ) {
                     arrayList.add(inputStream.read());
                     }
            }
        inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(arrayList);
        for (int i: arrayList) {
            System.out.print(i);
            System.out.println();
        }


        // напишите тут ваш код
    }
            }
