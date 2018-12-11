package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> map = new HashMap<>();
        map.put("Kitty1", new Cat("Kitty1"));
        map.put("Kitty2", new Cat("Kitty2"));
        map.put("Kitty3", new Cat("Kitty3"));
        map.put("Kitty4", new Cat("Kitty4"));
        map.put("Kitty5", new Cat("Kitty5"));
        map.put("Kitty6", new Cat("Kitty6"));
        map.put("Kitty7", new Cat("Kitty7"));
        map.put("Kitty8", new Cat("Kitty8"));
        map.put("Kitty9", new Cat("Kitty9"));
        map.put("Kitty10", new Cat("Kitty10"));
        return map;
        //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        HashSet<Cat> cats = new HashSet<>();
        for (Map.Entry<String,Cat> entry : map.entrySet()) {
            cats.add(entry.getValue());
        }

        return cats;
        //напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
