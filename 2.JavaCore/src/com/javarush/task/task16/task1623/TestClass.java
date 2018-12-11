package com.javarush.task.task16.task1623;

/**
 * Created by A650322 on 14.06.2018.
 */
import java.util.*; //  What will be the result of attempting to compile the following program?
public class TestClass{

        public static void main(String[] args) throws Exception{
            int[] a = null;
            int i = a [ m1() ];
        }
        public static int m1() throws Exception{
            throw new Exception("Some Exception");
        }
    }

