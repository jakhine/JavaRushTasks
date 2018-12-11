package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String s;
        private int i;
        private boolean aBoolean;
        private float f;
        private double d;
        private byte b;

        public Human(String s){
            this.s = s;
        }
        public Human(int i){ this.i=i;      }
        public Human(boolean aBoolean){this.aBoolean = aBoolean;       }
        public Human(float f){  this.f = f;     }
        public Human(double d){ this.d = d  ;     }
        public Human(byte b){ this.b = b;      }
        public Human(int i,String s ){this.i = i; this.s = s;       }
        public Human(String s, int i,boolean aBoolean){this.s =s; this.i =i; this.aBoolean = aBoolean;       }
        public Human(float f, byte b  ){   this.f = f; this.b =b;  }
        public Human(float f, byte b,double d){this.f =f; this.b = b; this.d = d;       }
        // напишите тут ваши переменные и конструкторы
    }
}
