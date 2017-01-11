package com.cypaubr.jmath.analysis;

/**
 * This class represents a ax+b function
 * @author Cyprien A.
 * @version 1.0
 */
public class LinearFunction {

    private double a,b;

    /**
     * Linear function constructor
     * @param a int
     * @param b int
     */
    public LinearFunction(double a, double b){
        this.a = a;
        this.b = b;
    }

    /**
     * Returns the image of the given number by the function
     * @param x double
     * @return double
     */
    public double image(double x){
        return (a*x)+b;
    }

    /**
     * Return the slope of the function
     * @return double
     */
    public double getA() {
        return a;
    }

    /**
     * Set the slope of the function
     * @param a double
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * Returns the intercept of the function
     * @return double
     */
    public double getB() {
        return b;
    }

    /**
     * Set the intercept of the function
     * @param b double
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * Returns the function as a string
     * @return String

     */
    public String toString(){
        return a+"x+"+b;
    }
}
