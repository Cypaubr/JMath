package com.cypaubr.jmath.trigonometry;

import com.cypaubr.jmath.analytical.PlaceableInSpace;
import com.cypaubr.jmath.analytical.Point;

/**
 * This class defines a triangle
 * @author Cyprien A.
 * @version 1.0
 */
public class Triangle implements PlaceableInSpace{

    private double a,b,c;
    private Point A,B,C;

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
     * Triangle constructor from Points
     * @param A Point
     * @param B Point
     * @param C Point
     */
    public Triangle (Point A, Point B, Point C){
        this.A = A;
        this.B = B;
        this.C = C;
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

    /**
     * Return the Point A of the Triangle
     * @return Point
     */
    public Point getPointA(){
        return this.A;
    }

    /**
     * Return the Point B of the Triangle
     * @return Point
     */
    public Point getPointB(){
        return this.B;
    }

    /**
     * Return the Point C of the Triangle
     * @return Point
     */
    public Point getPointC(){
        return this.C;
    }

    @Override
    public boolean isPlaceableInSpace() {
        if (A != null && B != null && C != null){
            return true;
        } else {
            return false;
        }
    }
}
