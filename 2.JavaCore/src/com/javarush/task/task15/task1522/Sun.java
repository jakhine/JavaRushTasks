package com.javarush.task.task15.task1522;

/**
 * Created by A650322 on 04.05.2018.
 */
public class Sun implements Planet {

private static Sun instance;
    private Sun(){}
    public static synchronized Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
        }
        return instance;
    }
}