package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/*
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream  input = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(input.available()>0){
            list.add(input.read());
        }
        ArrayList<Integer> copy = new ArrayList<>();
        reader.close();
        input.close();
        Map<Integer,Integer> map = new HashMap<>();
        for (int b:list) {
            if (check(copy, b))copy.add(b);
        }
        Collections.sort(copy);
        for (int i:copy
             ) {
            System.out.print(i+" ");

        }
   }
    static boolean check( ArrayList<Integer> list , int b){
        int count=0;
        for (int e :list) {
            if (e==b) count++;
        }
        return count<1;
    }
}
