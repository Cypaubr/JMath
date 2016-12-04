package com.cypaubr.jmath.geometry.analytical;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Vector {

    private double norm,x,y;
    private Point A,B;

    /**
     * Creates a Vector from its norm
     * @param norm double
     */
    public Vector(double norm){
        this.norm = norm;
    }

    /**
     * Creates a Vector from its coordinates
     * @param x double
     * @param y double
     */
    public Vector(double x, double y){
        this.x = x;
        this.y = y;
        this.norm = sqrt(pow(x,2) + pow(y,2));
    }

    /**
     * Creates a Vector from 2 Points
     * @param A Point
     * @param B Point
     */
    public Vector(Point A, Point B){
        this.A = A;
        this.B = B;
        this.x = B.getX() - A.getX();
        this.y = B.getY() - A .getY();
        this.norm = sqrt(pow(x,2) + pow(y,2));
    }

    /**
     * Return the norm of the Vector
     * @return double
     */
    public double getNorm(){
        return this.norm;
    }

    /**
     * Return the abscissa of the Vector
     * @return double
     */
    public double getX(){
        return this.x;
    }

    /**
     * Return the ordinates of the Vector
     * @return double
     */
    public double getY(){
        return this.y;
    }
}
