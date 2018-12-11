package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat[] = new Cat[10];
        for (int i = 0 ; i<10; i++) {
            cat[i]=new Cat();
        }        //создай 10 котов

        System.out.println(Cat.catCount);//выведи значение переменной catCount
    }



    public static class Cat {
       public static int catCount = 0;
       //создай статическую переменную catCount

       public Cat(){
           Cat.catCount++;
       } //создай конструктор
    }
}
