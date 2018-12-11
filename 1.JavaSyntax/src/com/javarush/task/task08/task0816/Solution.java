package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Luke Skywalker", new Date("MAY 4 1990"));
        map.put("Shal'nev", new Date("JULY 11 1985"));
        map.put("Sergey", new Date("AUGUST 29 1961"));
        map.put("Natalia", new Date("NOVEMBER 29 1994"));
        map.put("Neighbor", new Date("JULY 12 1990"));
        map.put("Vadoo", new Date("JANUARY 3 1990"));
        map.put("MADRE", new Date("FEBRUARY 9 1964"));
        map.put("FEMALE", new Date("MARCH 8 1990"));
        map.put("O'NEIL", new Date( "APRIL 3 1990"));
        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Date summer = new Date("JUNE");

        for (Map.Entry<String,Date> pair  : map.entrySet()) {
            System.out.println(pair.getValue().getMonth());

//            if ("JUNE".equals(pair.getValue())){//||"JULY".equals(pair.getValue())||"AUGUST".equals(pair.getValue())) {
//                map.remove(pair.getKey());
//            }
           }
        //напишите тут ваш код

    }

    public static void main(String[] args) {
        HashMap map = createMap();
        removeAllSummerPeople(map);
    }
}
