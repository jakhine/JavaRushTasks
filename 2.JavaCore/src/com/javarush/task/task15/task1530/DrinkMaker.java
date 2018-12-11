package com.javarush.task.task15.task1530;

/**
 * Created by A650322 on 07.05.2018.
 */
public abstract class DrinkMaker {
    abstract void getRightCup();
    abstract void putIngredient() ;
    abstract void pour();
    public void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }

}
