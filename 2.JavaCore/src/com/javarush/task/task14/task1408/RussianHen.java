package com.javarush.task.task14.task1408;

/**
 * Created by A650322 on 16.03.2018.
 */
public  class RussianHen extends Hen {
    int getCountOfEggsPerMonth(){return 150;}
    String getDescription(){
        return   (  super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() +" яиц в месяц.");}
}