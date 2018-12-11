package com.javarush.task.task08.task0818;

import java.util.*;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Иванов", 300);
        map.put("диванов", 400);
        map.put("пиванов", 500);
        map.put("сриванов", 1300);
        map.put("гиванов", 100);
        map.put("фриванов", 200);
        map.put("стёгиванов", 600);
        map.put("подгибаванов", 3200);
        map.put("мариванов", 6700);
        map.put("грибанов", 900);
        //напишите тут ваш код
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> entry : copy.entrySet()
                ) {
            if (entry.getValue() < 500) {
                map.remove(entry.getKey());
            }
        //    for (int i = 0; i < keys.size(); i++) { map.remove(keys[i]);    }
            //напишите тут ваш код
        }
      //  System.out.println(keys);
    }

    public static void main(String[] args) {
       /* HashMap<String, Integer> map = createMap();
        removeItemFromMap(map);
        //   System.out.println()
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
*/
        }

    }
