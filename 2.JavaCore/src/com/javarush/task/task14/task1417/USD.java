package com.javarush.task.task14.task1417;

/**
 * Created by A650322 on 10.04.2018.
 */
public class USD extends Money {
    public String getCurrencyName(){
        return "USD";
    }
   public USD (double amount) {
        super(amount);
   }

}
