package com.cypaubr.jmath.geometry;

import com.cypaubr.jmath.PointPositionException;
import com.cypaubr.jmath.geometry.analytical.PlaceableInSpace;
import com.cypaubr.jmath.geometry.analytical.Point;

/**
 * This class defines a square
 * @author Cyprien A.
 * @version 1.0
 */
public class Square implements PlaceableInSpace{

    private double side;
    private Point A,B,C,D;

    /**
     * Simple square constructor
     * @param side double
     */
    public Square(double side){
        this.side = side;
    }

    /**
     * Construct a square from Points
     * @param A Point
     * @param B Point
     * @param C Point
     * @param D Point
     * @throws PointPositionException
     */
    public Square(Point A, Point B, Point C, Point D) throws PointPositionException{
        if (A.getY() != B.getY() || D.getY() != C.getY() || A.getX() != D.getX() || B.getX() != C.getX()){
            throw new PointPositionException();
        } else {
            this.A = A;
            this.B = B;
            this.C = C;
            this.D = D;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.side, side) != 0) return false;
        if (!A.equals(square.A)) return false;
        if (!B.equals(square.B)) return false;
        if (!C.equals(square.C)) return false;
        return D.equals(square.D);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(side);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + A.hashCode();
        result = 31 * result + B.hashCode();
        result = 31 * result + C.hashCode();
        result = 31 * result + D.hashCode();
        return result;
    }

    /**
     * Return the side of the square
     * @return double

     */
    public double getSide() {
        return side;
    }

    /**
     * Return Point A of the square
     * @return
     */
    public Point getPointA() {
        return A;
    }

    /**
     * Return Point B of the square
     * @return Point
     */
    public Point getPointB() {
        return B;
    }

    /**
     * Return Point C of the square
     * @return Point
     */
    public Point getPointC() {
        return C;
    }

    /**
     * Return Point D of the square
     * @return Point
     */
    public Point getPointD() {
        return D;
    }

    /**
     * Calculates the perimeter of the Square
     * @return double
     */
    public double getPerimeter(){
        return 4.0*side;
    }

    @Override
    public boolean isPlaceableInSpace() {
        if (A != null && B != null && C != null && D != null){
            return true;
        } else {
            return false;
        }
    }
}
