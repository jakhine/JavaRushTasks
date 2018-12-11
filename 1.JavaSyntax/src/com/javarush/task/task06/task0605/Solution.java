package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.massIndex(weight, height);
    }

    public static class Body {
        public static void massIndex(double weight, double height) {
            double mI    = weight/(height*height);
            System.out.println(mI);
            if (mI < 18.5) {
                System.out.println("Недовес: меньше чем 18.5");}
                        else{ if (mI > 18.5 && mI < 24.9) {System.out.println("Нормальный: между 18.5 и 24.9");}
                                    else { if (mI > 25 && mI < 29.9) {System.out.println("Избыточный вес: между 25 и 29.9");}
                                        else {System.out.println("Ожирение: 30 или больше");}}}
                     //напишите тут ваш код
        }
    }
}
//1. Метод massIndex должен выводить текст на экран.
//        2. Метод massIndex должен выводить "Недовес: меньше чем 18.5" на экран, если индекс массы тела меньше 18.5.
//        3. Метод massIndex должен выводить "Нормальный: между 18.5 и 24.9" на экран, если индекс массы тела между 18.5 и 24.9.
//        4. Метод massIndex должен выводить "Избыточный вес: между 25 и 29.9" на экран, если индекс массы тела между 25 и 29.9.
//        5. Метод massIndex должен выводить "Ожирение: 30 или больше" на экран, если индекс массы тела 30 или больше.