package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }
    public static void main(String[] args) {
    }

    public static class DataAdapter implements RowItem{
        private Customer customer;
        private Contact contact;
        @Override
        public String getCountryCode() {
            for (Map.Entry entry:countries.entrySet()) {
                if(entry.getValue().equals(customer.getCountryName())){
                    return entry.getKey().toString();
                }
            }
            return null;

        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String[] fullName = contact.getName().split(", ");

            return fullName[1];
        }

        @Override
        public String getContactLastName() {
            String[] fullName = contact.getName().split(", ");

            return fullName[0];
        }

        @Override
        public String getDialString() {
           char[] phArr = contact.getPhoneNumber().trim().toCharArray();
           StringBuilder phoneN = new StringBuilder();
            for (char c : phArr) {
                if(c=='+'||c=='-'||c=='('||c==')');
                    else phoneN.append(c);
            }
            phoneN.insert(0,"callto://+");

            return phoneN.toString();
        }

        public DataAdapter(Customer customer, Contact contact) {
            this.contact = contact;
            this.customer = customer;
        }
    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA
        String getCompany();            //For example: JavaRush Ltd.
        String getContactFirstName();   //For example: Ivan
        String getContactLastName();    //For example: Ivanov
        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.
        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan
        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}