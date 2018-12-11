package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> addresses = new ArrayList<String>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.add(family);
        }
        HashMap<String,String> famCity = new HashMap<>();
        for (int i = 0; i < addresses.size()-1; i++) {
            famCity.put(addresses.get(i),addresses.get(i+1));
        }
        //read home number
        //int houseNumber = Integer.parseInt(reader.readLine());
        //if (0 <= houseNumber && houseNumber < addresses.size()) {
         //   String familySecondName = addresses.get(houseNumber);
        //    System.out.println(familySecondName);
        //}
        String city = reader.readLine();
        System.out.println(famCity.get(city));
    }
}
