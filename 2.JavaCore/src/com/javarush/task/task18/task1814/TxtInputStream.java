package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException{
        super(fileName);
        String extension = fileName.trim().toLowerCase().substring(fileName.length()-4);
        System.out.println(extension);
        if (extension.equals(".txt")){

        }
        else {
            super.close();
                        throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) {
    }
}

