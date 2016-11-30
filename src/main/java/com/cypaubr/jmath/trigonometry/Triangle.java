package com.cypaubr.jmath.trigonometry;

/**
 * This class defines a triangle
 * @author Cyprien A.
 * @version 1.0
 */
public class Triangle {

    private double a,b,c;

    /**
     * Triangle constructor
     * @param a double
     * @param b double
     * @param c double
     */
    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Return the A side of the Triangle
     * @return double
     */
    public double getA(){
        return this.a;
    }

    /**
     * Return the B side of the Triangle
     * @return double
     */
    public double getB(){
        return this.b;
    }

    /**
     * Return the C side of the Triangle
     * @return doublr
     */
    public double getC(){
        return this.c;
    }
}
