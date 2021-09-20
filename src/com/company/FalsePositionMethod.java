package com.company;

import java.util.Scanner;

public class FalsePositionMethod {
    public static float f(float x) {
        return x * x - 4;
    }

    public static void main(String[] args) {
        float a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st Limit = ");
        a = scanner.nextFloat();
        System.out.print("Enter 2nd Limit = ");
        b = scanner.nextFloat();
        c = a-f(a)*((b-a)/(f(b)-f(a)));

        if (f(a) * f(b) < 0) {
            while (Math.abs(f(c)) > 0.01) {
                if (f(c) * f(a) > 0) {
                    a = c;
                } else {
                    b = c;
                }
                /*m = (f(b) - f(a)) / (b - 1);
                c = a - (f(a) / m);*/
                c = a-f(a)*((b-a)/(f(b)-f(a)));
            }
            System.out.println("The Root is = " + c);
        } else {
           System.out.println("The Limit are not valid");
        }
   }
}
