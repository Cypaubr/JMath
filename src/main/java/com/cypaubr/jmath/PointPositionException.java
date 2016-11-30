package com.cypaubr.jmath;

/**
 * Exception when the point are not matching an expected shape (a square for
 * example)
 * @author Cyprien A.
 * @version 1.0
 */
public class PointPositionException extends Exception {
    public PointPositionException(){
        super();
    }

    @Override
    public String getMessage() {
        return "The points are not matching the expected shape";
    }
}
