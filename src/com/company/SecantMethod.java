package com.company;

public class SecantMethod {
    static float f(float x) {
        return (x*x)-(4*x)-10;
    }
    static void secant(float x1, float x2,float E) {
        float n = 0, xm, x0, c;
        if (f(x1) * f(x2) < 0)
        {
            do {
                x0 = x2-((x2-x1)/(f(x2)-f(x1))*f(x2));
                c = f(x1) * f(x0);
                if (c == 0)
                    break;
                x1 = x2;
                x2 = x0;
                n++;
                xm = x2-((x2-x1)/(f(x2)-f(x1))*f(x2));
            } while (Math.abs(xm - x0) >= E);

            System.out.println("Root of the given equation=" + x0);
            System.out.println("No. of iterations = " + n);
        }
        else
            System.out.print("Can not find a root in the given interval");
    }

    public static void main(String[] args) {
        float x1 = 6, x2 = 2, E = 0.0001f;
        secant(x1, x2, E);
    }
}
