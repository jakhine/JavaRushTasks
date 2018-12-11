package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ягода,
банан - трава,
вишня - ягода,
груша - фрукт,
дыня - овощ,
ежевика - куст,
жень-шень - корень,
земляника - ягода,
ирис - цветок,
картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("арбуз","ягода");
        hashMap.put("банан","трава");
        hashMap.put("вишня","ягода");
        hashMap.put("груша","фрукт");
        hashMap.put("дыня","овощ");
        hashMap.put("ежевика","куст");
        hashMap.put("жень-шень","корень");
        hashMap.put("земляника","ягода");
        hashMap.put("ирис","цветок");
        hashMap.put("картофель","клубень");

        for (Map.Entry<String,String> couple : hashMap.entrySet())
        {String value = couple.getValue();
        String key = couple.getKey();
            System.out.println(key +" - "+ value);


        }
        
        //напишите тут ваш код

    }
}
