package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        BufferedReader in = new BufferedReader( new FileReader(filename));
        int id =Integer.parseInt(args[0]);
        String s;
        while((s = in.readLine())!= null){

          String ss[]=s.split(" ");
          if (id == Integer.parseInt(ss[0])) {
              System.out.println(s);
              reader.close();
              in.close();
              break;
          }
        }
        //        FileInputStream inputStream = new FileInputStream(reader.readLine());
    }
}
