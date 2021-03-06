package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import com.sun.javafx.binding.StringFormatter;

import javax.swing.text.MaskFormatter;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
        static {
            countries.put("UA", "Ukraine");
            countries.put("RU", "Russia");
            countries.put("CA", "Canada");
        }
    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer,Contact{
            private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
                String pnum = String.format("%010d",data.getPhoneNumber());
                String[] pNumArr={pnum.substring(0, 3),
                        pnum.substring(3,6),
                        pnum.substring(6,8),
                        pnum.substring(8)};
                String phoneNum = "+" + data.getCountryPhoneCode()+ "(" + pNumArr[0]+ ")" + pNumArr[1]+ "-" + pNumArr[2]+ "-" + pNumArr[3];
            return phoneNum;

        }
    }


    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {

            String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}