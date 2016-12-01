package com.cypaubr.jmath.geometry.trigonometry;

import com.cypaubr.jmath.geometry.analytical.PlaceableInSpace;
import com.cypaubr.jmath.geometry.analytical.Point;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

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
        //calculate the a side length
        a = sqrt(pow((B.getX()-A.getX()),2) + pow((B.getY()+A.getY()),2));
        //calculate the b side length
        b = sqrt(pow((C.getX()-B.getX()),2) + pow((C.getY()+B.getY()),2));
        //calculate the c side
        c = sqrt(pow((A.getX()-C.getX()),2) + pow((A.getY()+C.getY()),2));
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

    /**
     * Return the perimeter of the Triangle
     * @return double
     */
    public double getPerimeter(){
        return a+b+c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.a, a) != 0) return false;
        if (Double.compare(triangle.b, b) != 0) return false;
        if (Double.compare(triangle.c, c) != 0) return false;
        if (!A.equals(triangle.A)) return false;
        if (!B.equals(triangle.B)) return false;
        return C.equals(triangle.C);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(a);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(c);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + A.hashCode();
        result = 31 * result + B.hashCode();
        result = 31 * result + C.hashCode();
        return result;
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
