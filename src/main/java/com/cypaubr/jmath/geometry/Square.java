package com.cypaubr.jmath.geometry;

import com.cypaubr.jmath.PointPositionException;
import com.cypaubr.jmath.geometry.analytical.Point;

public class Square{

    private double side;
    private Point A,B,C,D;

    public Square(double side){
        this.side = side;
    }

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
}
