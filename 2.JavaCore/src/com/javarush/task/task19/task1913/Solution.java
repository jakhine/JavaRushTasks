package com.javarush.task.task19.task1913;

/* 
Выводим только цифры
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;//запоминаем настоящий PrintStream в специальную переменную,
        // дабы потом вернуть его в изначальном виде.

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();//создаем ссылку на поток в виде динамического массив байтов
        PrintStream myStream = new PrintStream(outputStream);   //создаем адаптер к классу PrintStream - ссылку
        // на свой поток из ранне объявленного динамического массива байтов

        System.setOut(myStream);//Устанавливаем свой поток/адаптер как текущее значение System.out
        testString.printSomething();//Вызываем функцию, которая по умолчанию выводит  в консоль сиречь PrintStream текст "it's a text for testing", но!
        // PrintStream подменен нами на этом этапе выполнения программы на свой адаптер - массив байтов.

        String result = outputStream.toString().toUpperCase();
        StringBuilder sb = new StringBuilder();
        char [] myAr = result.toCharArray();
        for (char c: myAr) {
            if (c=='0'|c=='1'|c=='2'|c=='3'|c=='4'|c=='5'|c=='6'|c=='7'|c=='8'|c=='9'){
                sb.append(c);
            }

        }


        System.setOut(consoleStream);// возвращаем переменной setOut исходное значение
        System.out.println(sb);// в итоге строка выводится в upperCase, согласно нашей обертке
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
