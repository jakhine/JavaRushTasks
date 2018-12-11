package com.javarush.task.task14.task1417;

/**
 * Created by A650322 on 10.04.2018.
 */
public class Hrivna extends Money {
    public String getCurrencyName(){
        return "HRN";
    }
    public Hrivna (double amount) {
        super(amount);
    }
}
