package com.cypaubr.jmath.analysis;

/**
 * This class represents a 2nd degree polynomial fuction
 * defined by the form ax²+bx+c=0
 * @author Cyprien A.
 * @version 1.0
 */
public class Polynomial2Function extends Function{

    private double a,b,c;

    /**
     * Polynomial function constructor
     * @param a double
     * @param b double
     * @param c double
     */
    public Polynomial2Function(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
