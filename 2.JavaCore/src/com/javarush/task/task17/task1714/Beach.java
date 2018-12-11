package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public  synchronized void setName(String name) {
        this.name = name;
    }

    public  synchronized float getDistance() {
        return distance;
    }

    public  synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public  synchronized int getQuality() {
        return quality;
    }

    public  synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public  synchronized  int compareTo(Beach o) {

      //  return  (this.quality - o.getQuality()) - (int)this.distance - (int)o.getDistance();
     return   (this.getQuality() - (int) this.getDistance()) - (o.getQuality() - (int)o.getDistance());
    }

    public static void main(String[] args) {
//
//        Beach b1 = new Beach("Боровое", 150f, 6);
//        Beach b2 = new Beach("Чертовицк", 1000f, 8);
//        Beach b3 = new Beach("Лесной Балаган", 10000f, 10);
//        Beach b4 = new Beach("Sochi", 100000f, 150);
//        System.out.println(b1.compareTo(b2));
//        System.out.println(b2.compareTo(b1));
//        System.out.println(b2.compareTo(b3));
//        System.out.println(b3.compareTo(b2));
//        System.out.println(b4.compareTo(b3));
//        System.out.println(b3.compareTo(b4));
//        System.out.println(b4.compareTo(b4));


    }
}
