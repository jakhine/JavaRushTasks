package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args)  throws  IOException, DownloadException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String file1 = reader.readLine();
            FileInputStream input1 = new FileInputStream(file1);
            byte[] buffer = new byte[10000];
            int count = input1.read(buffer);
            if (count < 1000) {
                input1.close();
                reader.close();
                throw new DownloadException();
            }
            else continue;
        }
    }
    public static class DownloadException extends Exception {

    }
}
