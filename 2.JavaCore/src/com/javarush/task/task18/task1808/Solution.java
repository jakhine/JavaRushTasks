package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
//        System.out.println(45/2);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        FileInputStream input1 = new FileInputStream(file1);
        FileOutputStream write1 = new FileOutputStream(file2);
        FileOutputStream write2 = new FileOutputStream(file3);

        if (input1.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[1000];
            int count = input1.read(buffer);
            if (count%2==0)  {
                write1.write(buffer, 0, count/2);
                write2.write(buffer,count/2, count/2);
                }
            else {
                write1.write(buffer, 0, count/2+1);
                write2.write(buffer,count/2+1, count/2);
            }
        }
        reader.close();
        input1.close();
        write1.close();
        write2.close();   }
}
