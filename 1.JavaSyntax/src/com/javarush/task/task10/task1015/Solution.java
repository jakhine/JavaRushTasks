package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String> list  = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add("Строка " + i);
        }
        ArrayList<String> list1  = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list1.add("Строка " + i);
        }
        ArrayList<String> list3  = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list3.add("Строка " + i);
        }
         ArrayList<String>[] arrayOfStringList = new ArrayList[]{list,list1,list3};


        //напишите тут ваш код

        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}