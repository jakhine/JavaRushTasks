package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileName = reader.readLine();
            boolean possible = true;
            BufferedWriter writer = new BufferedWriter(new PrintWriter(fileName));
            while (possible){
                String s = reader.readLine();
                if (!s.equals("exit")){
                    writer.write(s);
                    writer.newLine();

                }
                else {
                    writer.write(s);
                    writer.newLine();
                    possible = false;
                }

            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // напишите тут ваш код
    }
}
