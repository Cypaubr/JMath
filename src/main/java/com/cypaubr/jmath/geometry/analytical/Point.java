package com.cypaubr.jmath.geometry.analytical;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * This class defines a Point
 * @author Cyprien A.
 * @version 1.0
 */
public class Point implements PlaceableInSpace{
    private double x,y;

    /**
     * Main Point constructor
     * @param x double
     * @param y double
     */
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Return the abscissa of the Point
     * @return double
     */
    public double getX() {
        return x;
    }

    /**
     * Return the ordinates of the Point
     * @return double
     */
    public double getY() {
        return y;
    }

    /**
     * Calcluates the distance between two Points
     * @param A Point
     * @param B Point
     * @return double
     */
    public static double distanceBetween(Point A, Point B){
        return sqrt(pow(B.getX()-A.getX(),2) + pow(B.getY()-A.getY(),2));
    }

    @Override
    public boolean isPlaceableInSpace() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (Double.compare(point.x, x) != 0) return false;
        return Double.compare(point.y, y) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
