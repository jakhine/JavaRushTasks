package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[20];
        for (int i = 0; i <arr.length; i++) {
            String s = bufferedReader.readLine();
            arr[i] = Integer.parseInt(s);

                    }
//        System.out.println("создан массив arr " + arr[19]);
        // создай и заполни массив
        return arr;
    }

    public static int max(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length ; i++)
        {
            if (array[i] > max)
                max = array[i];
        }

        // найди максимальное значение
        return max;
    }
}
