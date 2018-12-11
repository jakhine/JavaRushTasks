package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> main = new ArrayList<>();
        ArrayList<Integer> dvd3 = new ArrayList<>();
        ArrayList<Integer> dvd2 = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <20 ; i++) {
            main.add(Integer.parseInt(reader.readLine()));
            }
        for (int i: main) {
            if (i % 3 == 0) dvd3.add(i);
            if (i % 2 == 0) dvd2.add(i);
            if (i % 3 != 0 && i % 2 != 0) other.add(i);
        }
            printList(dvd3);
            printList(dvd2);
            printList(other);
                //напишите тут ваш код
    }

    public static void printList(List<Integer> list) {
        for (int i:list) {
            System.out.println(i);
        }
    //    System.out.println("******");

        //напишите тут ваш код
    }
}
