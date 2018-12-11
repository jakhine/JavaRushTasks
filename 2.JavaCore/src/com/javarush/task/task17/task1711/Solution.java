package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;


/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateInput = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat dateOutput = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
       switch (args[0]){
            case "-c": {
                synchronized (allPeople){
                    for (int i = 1; i <args.length-2 ; i=i+3) {
                        Date date = dateInput.parse(args[i + 2]);
                        if (args[i+1].equalsIgnoreCase("м")) {
                            allPeople.add(Person.createMale(args[i], date));
                        } else allPeople.add(Person.createFemale(args[i], date));
                        System.out.println(allPeople.size() - 1);
                    }
                break;
            }
            }
            case "-u":{
                synchronized (allPeople) {
                    for (int i = 1; i <args.length-3 ; i=i+4) {
                        int index = Integer.parseInt(args[i]);
                        allPeople.get(index).setName(args[i+1]);
                        if (args[i+2].equalsIgnoreCase("м")) allPeople.get(index).setSex(Sex.MALE);
                        else allPeople.get(index).setSex(Sex.FEMALE);
                        allPeople.get(index).setBirthDay(dateInput.parse(args[i+3]));
                    }
                    break;
                }
            }
            case "-d":{
                synchronized (allPeople) {
                    for (int i = 1; i <args.length ; i++) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        person.setBirthDay(null);
                        person.setSex(null);
                        person.setName(null);
                    }
                    //  allPeople.set(Integer.parseInt(args[1]),null);
                    break;
                }
            }
            case "-i":{
                synchronized (allPeople) {
                    for (int i = 1; i <args.length ; i++) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        String sex = person.getSex().equals(Sex.MALE) ? "м" : "ж";
                        System.out.println(person.getName() + " " + sex + " " + dateOutput.format(person.getBirthDay()));
                    }
                    break;
                }
            }
        }
        //start here - начни тут
    }
}
