package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Surname0","Name");
        map.put("Surname01","Name2");
        map.put("Surname02","Namee");
        map.put("Surname03","Name");
        map.put("Surname04","Namea");
        map.put("Surname05","Names");
        map.put("Surname06","Name");
        map.put("Surname07","Name2");
        map.put("Surname08","Namen");
        map.put("Surname09","Name");
        //напишите тут ваш код
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
      //  Array<String> list = new ArrayList<>();

        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNamesKeys = new ArrayList<>();
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            firstNames.add(pair.getValue());
            lastNamesKeys.add(pair.getKey());
                         }
//        for (String q : lastNamesKeys
//             ) {
//            System.out.println(q + " " + firstNames.get(lastNamesKeys.indexOf(q)));
//
//        }

        //for (String s : firstNames) {
       // int b = 1;
            for (int i = 0 ; i <firstNames.size() ; i++) {
                for (int j = 1; j+i < firstNames.size(); j++) {
                    if (firstNames.get(i).equals(firstNames.get(i + j))) {
                       // System.out.println(lastNamesKeys.get(i));
                        removeItemFromMapByValue(map, firstNames.get(i)) ;

                    }
                }
            }
//                if (i  != firstNames.indexOf(s)) {
//                    if (s.equals(firstNames.get(i))) {
//
//                        lastNamesKeys.remove(i);
//                    }
//                }
//            }
       // }
        //if (pair.getValue().equals())
        //     map.remove(pair.getKey()); //напишите тут ваш код

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
     //   HashMap<String, String> map = createMap();
      //  removeTheFirstNameDuplicates(map);

    }
}
