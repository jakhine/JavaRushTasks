package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human ded1 = new Human("Дедушка Раз",true,80);
        Human ded2 = new Human("Дедушка два",true,81);
        Human baba1 = new Human("Бабушка Раз",false,82);
        Human baba2 = new Human("Бабушка два",false,83);
        Human papa = new Human("PAPA",true,35);
        Human mama = new Human("MAMA",false,33);
        Human child1 = new Human("Petya", true,12);
        Human child2 = new Human("Vasya", true,8);
        Human child3 = new Human("Manya", false,5);
        ded1.children.add(papa);
        baba1.children.add(papa);
        ded2.children.add(mama);
        baba2.children.add(mama);
        papa.children.add(child1);
        papa.children.add(child2);
        papa.children.add(child3);
        mama.children.add(child1);
        mama.children.add(child2);
        mama.children.add(child3);
        System.out.print(ded1 +  "\n" + baba1 +  "\n" + ded2 +  "\n" + baba2 +  "\n" + papa +  "\n" + mama +  "\n" + child1 +  "\n" + child2 +  "\n" + child3);

        //напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;
         Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            ArrayList<Human> children = new ArrayList<>();
            this.children = children;
        }

        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
