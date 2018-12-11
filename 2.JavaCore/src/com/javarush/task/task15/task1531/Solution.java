package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
//        for(int i = 0; i <= input; i++)
//            System.out.println(i + "! = " + factorial(i));
    }

    public static String factorial(int n) {
        ArrayList<BigInteger> cache = new ArrayList<>();
        cache.add(BigInteger.valueOf(1));
        BigInteger f = BigInteger.valueOf(n);
        if (n<0) return "0";

        for(int size = cache.size(); size <= n; size++)
        {
            BigInteger lastfact = cache.get(size-1);
            BigInteger nextfact = lastfact.multiply(BigInteger.valueOf(size));
            cache.add(nextfact);
        }

        return  cache.get(n).toString();
    }

//
//        else if (n==0) return "1";
//        else for ( i <=n ; i++) {
//               f.multiply(i);
//
//            }
//          //add your code here

//        return       BigInteger.valueOf(f).toString();

    }

