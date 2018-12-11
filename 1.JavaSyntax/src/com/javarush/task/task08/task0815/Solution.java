package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> map = new HashMap();
        map.put("Яхин", "Александр");
        map.put("Зотов", "Иван");
        map.put("Фёдоров", "Вадим");
        map.put("Веллас", "Артем");
        map.put("Пономарёв", "Кирилл");
        map.put("Ломов", "Эдуард");
        map.put("Дибров", "Валерий");
        map.put("Федосов", "Константин");
        map.put("Александров", "Станислав");
        map.put("Масленников", "Юрий");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int counter = 0;
        for (String names:map.values()) {
            if (names.equals(name)) counter++;
            }
        return counter;
                //напишите тут ваш код
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int counter = 0;
        for (String lNames:map.keySet()) {
            if (lNames.equals(lastName)) counter++;
        }
        return counter;
        //напишите тут ваш код

    }

    public static void main(String[] args) {
   //     HashMap<String,String> map = createMap();
     //   System.out.println(getCountTheSameFirstName(map, "Станислав"));
       // System.out.println(getCountTheSameLastName(map, "Федосов"));

    }
}
