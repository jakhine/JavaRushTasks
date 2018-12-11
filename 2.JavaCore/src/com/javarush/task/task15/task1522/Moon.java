package com.javarush.task.task15.task1522;

/**
 * Created by A650322 on 04.05.2018.
 */
public class Moon implements Planet{

    private static Moon instance;
    private Moon(){}

    public static synchronized Moon getInstance() {
        if (instance == null) {
            instance = new Moon();
        }
        return instance;
    }
}