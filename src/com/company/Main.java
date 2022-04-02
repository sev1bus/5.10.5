package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        for (int i=0; i<24; i++) {
            int b = i/10;
            int c = i%10;
            for (int i2=0; i2<60; i2++) {
                int d = i2/10;
                int f = i2%10;
                if (b == f && c == d) {
                    System.out.println(b + "" + c + ":" + d + "" + f);
                    a++;

                }
            }
        }
        System.out.println("Кількість співпадінь " + a);
    }
}