package com.javarush.task.task14.task1408;

/**
 * Created by A650322 on 16.03.2018.
 */
public  class BelarusianHen extends Hen  {
    int getCountOfEggsPerMonth(){return 110;}
    String getDescription(){
        return   ( super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() +" яиц в месяц.");}
}
