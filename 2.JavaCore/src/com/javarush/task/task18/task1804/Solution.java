package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream  input = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while(input.available()>0){
            list.add(input.read());
        }
        reader.close();
        input.close();
        Map<Integer,Integer> map = new HashMap<>();
        for (int b:list) {
            int count = 0;
            for (int e :list) {
                if (b==e) count++;
            }
            map.put(b,count);
        }
        int min = Collections.min(map.values());
        for (Map.Entry<Integer,Integer> s:map.entrySet()) {
            if (s.getValue()== min) System.out.print(s.getKey()+ " ");
        }

    }
}
