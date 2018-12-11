package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateInput = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat dateOutput = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        switch (args[0]){
            case "-c": {
                Date date = dateInput.parse(args[3]);
                if(args[2].equalsIgnoreCase("м")){
                    allPeople.add( Person.createMale(args[1],date));
                }  else allPeople.add( Person.createFemale(args[1],date));
                System.out.println(allPeople.size()-1);
                break;
            }
            case "-u":{
                int index = Integer.parseInt(args[1]);
                allPeople.get(index).setName(args[2]);
                if (args[3].equalsIgnoreCase("м")) allPeople.get(index).setSex(Sex.MALE);
                        else allPeople.get(index).setSex(Sex.FEMALE);
                allPeople.get(index).setBirthDay(dateInput.parse(args[4]));

                 break;

            }
            case "-d":{
                Person person = allPeople.get(Integer.parseInt(args[1]));
                person.setBirthDay(null);
                person.setSex(null);
                person.setName(null);
              //  allPeople.set(Integer.parseInt(args[1]),null);
                break;
            }
            case "-i":{
                Person person = allPeople.get(Integer.parseInt(args[1]));
                String sex = person.getSex().equals(Sex.MALE)?"м":"ж";
                System.out.println( person.getName() + " " + sex + " "  +  dateOutput.format(person.getBirthDay()));
                break;
            }
        }

        //start here - начни тут
    }
}
