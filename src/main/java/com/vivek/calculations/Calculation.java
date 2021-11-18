package com.vivek.calculations;

public class Calculation {

    public static void main(String[] args) {
        addMe();
    }

    public static void addMe(){

        double N1 = 0.0,N2,N3,N4;

        N1 = 0.25 * (1 - 0.5) * (1 - 0.5);
        System.out.println("N1 = " + N1);
        N2 = 0.25 * (1 + 0.5) * (1 - 0.5);
        System.out.println("N2 = " + N2);
        N3 = 0.25 * (1 + 0.5) * (1 + 0.5);
        System.out.println("N3 = " + N3);
        N4 = 0.25 * (1 - 0.5) * (1 + 0.5);
        System.out.println("N4 = " + N4);

        double T1=100, T2=60, T3=65, T4=85;
        double T_final = T3 * N1 + T4 * N2 + T1 * N3 + T2 * N4;
        System.out.println("T_final = " + T_final);

        double x1=15, x2=0, x3=0, x4=15;
        double x_final = x3 * N1 + x4 * N2 + x1 * N3 + x2 * N4;
        System.out.println("x_final = " + x_final);

        double y1=10, y2=10, y3=0, y4=0;
        double y_final = y3 * N1 + y4 * N2 + y1 * N3 + y2 * N4;
        System.out.println("y_final = " + y_final);

        double x11=6, x21=1, x31=1, x41=5;
        double x_final1 = x31 * N1 + x41 * N2 + x11 * N3 + x21 * N4;
        System.out.println("x_final1 = " + x_final1);

        double y11=8, y21=5, y31=1, y41=1;
        double y_final1 = y31 * N1 + y41 * N2 + y11 * N3 + y21 * N4;
        System.out.println("y_final1 = " + y_final1);
    }
}
