package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();
        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
//        for (Cat c:result) {
//            System.out.println("Создан " + c);
//        }
        //напишите тут ваш код
        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog>dogHashSet = new HashSet<>();
        dogHashSet.add(new Dog());
        dogHashSet.add(new Dog());
        dogHashSet.add(new Dog());

        //напишите тут ваш код
        return dogHashSet;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet pets = new HashSet();
        pets.addAll(dogs);
        pets.addAll(cats);
//        for (Object o: pets
//             ) {
//            System.out.println("Приджойнено "+ o);
//
//        }

        //напишите тут ваш код
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);


//        pets.removeIf(Predicate.isEqual(cats));
//        Object[] cats1 = cats.toArray();
//
//        for (int i = 0; i < cats1.length ; i++) {
//            pets.remove(cats1[i]);
//        }

//       HashSet copy = new HashSet(pets);
//        for (Object o:copy
//             ) {
//            if (o.equals(cats.toArray())) {
//                cat
//                System.out.println("удалил этот - " + o);
//                pets.remove(o);
//            }
//                 }
        //напишите тут ваш код
    }

    public static void printPets(Set<Object> pets) {
        for (Object o : pets
             ) {
            System.out.println(o);
        }
        //напишите тут ваш код
    }

    public static class Cat{}
    public static class Dog{}
    //напишите тут ваш код
}
