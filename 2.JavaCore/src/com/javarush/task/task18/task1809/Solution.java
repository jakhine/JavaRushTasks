package com.javarush.task.task18.task1809;

/*
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream input1 = new FileInputStream(file1);
        FileOutputStream write1 = new FileOutputStream(file2);

        byte[] buffer = new byte[1000];
        int count = input1.read(buffer);
        byte[]copy = new byte[count];
        for (int i = 0; i<count ; i++) {
        copy[i] = buffer[count-1-i];
        }
        write1.write(copy);


        input1.close();
        write1.close();
        reader.close();
    }
}
