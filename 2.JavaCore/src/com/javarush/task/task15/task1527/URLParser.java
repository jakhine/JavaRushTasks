package com.javarush.task.task15.task1527;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by A650322 on 07.05.2018.
 */
public class URLParser {

public static void urlParse (String url) {
     ArrayList<String> strings = new ArrayList<>();
    String subUrl = new String();
    String objValue = null;
    if (url.contains("&")){
        strings.add(url.substring((url.indexOf("?")+1), url.indexOf("&")));
        url= url.substring(url.indexOf("&")+1);
        if (strings.get(0).contains("=")) {


            if (strings.get(0).contains("obj")) {
                objValue = strings.get(0).substring(strings.get(0).indexOf("=")+1);

            }


        strings.add(strings.get(0).substring(0, strings.get(0).indexOf("=")));
        strings.remove(0);
        }}else if (strings.get(0).contains("=")) {
        strings.add(strings.get(0).substring(0, strings.get(0).indexOf("=")));
        strings.remove(0);}
     while (url.contains("&")) {
        int index = url.indexOf("&");
        subUrl = url.substring(0,index);
        if (subUrl.contains("=")){
            if (subUrl.contains("obj")) objValue = subUrl.substring(subUrl.indexOf("obj="));
            subUrl = subUrl.substring(index, subUrl.indexOf("="));
        }
        strings.add(subUrl);
        url = url.substring(url.indexOf("&")+1);
    }if (url.contains("=")) {
        if (url.contains("obj")) objValue = url.substring(url.indexOf("obj="));
        subUrl = url.substring(0,url.indexOf("="));
        strings.add(subUrl);
    }
    for (String str: strings) {
        System.out.print(str + " ");
    }
    System.out.println();
        try {
            Solution.alert(Double.parseDouble(objValue));
        } catch (NumberFormatException e) {
            Solution.alert(objValue);
        }
        catch(NullPointerException e){ }
    }
}
