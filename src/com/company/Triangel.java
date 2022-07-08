package com.company;

public class Triangel {
    int a;
    int b;
    int c;
    void area(){
        double p = (a + b + c)/2d;
        double s = p * (p - a) * (p - b) * (p - c);
        double s2 = Math.sqrt(s);
        System.out.println("S = " + s2);

    }
}
