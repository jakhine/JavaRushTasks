package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(0,new int[]{0,1,2,4,6});
        list.add(1,new int[]{0,1});
        list.add(2,new int[]{0,1,2,4});
        list.add(3,new int[]{0,1,2,4,6,78,4});
        list.add(4,new int[]{});
    return list;

        //напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
