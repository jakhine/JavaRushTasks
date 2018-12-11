package com.javarush.task.task14.task1408;

/**
 * Created by A650322 on 16.03.2018.
 */
public  class MoldovanHen extends Hen  {
    int getCountOfEggsPerMonth(){return 140;}
    String getDescription(){
        return   ( super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() +" яиц в месяц.");}
}