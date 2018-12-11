package com.javarush.task.task14.task1421;

/**
 * Created by A650322 on 11.04.2018.
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    private Singleton() {

    }
}
