package com.vivek.calculations;

public class Equation {

    public static void main(String[] args) {
        double s = 0;
        double t = 0;
        System.out.println("ans = " + deriveEquation(s, t));
    }

    private static double deriveEquation(double t, double s){
        System.out.println("t : "+ t);
        System.out.println("s : "+ s);
        double tSolve = 0.1406 * ( t - (t * t) - (2 * s * t) + (2 * s * (t * t))) * ( t - (t * t) - (2 * s * t) + (2 * s * (t * t)));
        double sSolve = 0.5625 * ( s - (s * s) - (2 * s * t) + (2 * (s * s) * t)) * ( s - (s * s) - (2 * s * t) + (2 * (s * s) * t));
        return tSolve + sSolve;
    }
}
