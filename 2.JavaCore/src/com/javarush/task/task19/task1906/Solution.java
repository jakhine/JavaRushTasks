package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1=reader.readLine();
        String file2=reader.readLine();

        FileReader fileReader = new FileReader(file1);
        FileWriter fileWriter = new FileWriter(file2);
        int i =0;
        while (fileReader.ready()){
            int buf = fileReader.read();
            if((i+1)%2==0) fileWriter.write(buf);
            i++;
        }
        reader.close();
        fileReader.close();
        fileWriter.close();

    }
}
