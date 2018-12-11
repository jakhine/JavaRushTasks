package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Surname0","Name");
        map.put("Surname01","Name2");
        map.put("Surname02","Namee");
        map.put("Surname03","Name");
        map.put("Surname04","Namea");
        map.put("Surname03","Names");
        map.put("Surname0","Name");
        map.put("Surname07","Name2");
        map.put("Surname0","Namen");
        map.put("Surname03","Name");
        //напишите тут ваш код
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
