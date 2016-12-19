package com.cypaubr.jmath.geometry.tridimensionnal;

import com.cypaubr.jmath.geometry.Square;

import java.util.Map;

/**
 * This class defines a cube in 3D
 * @author Cyprien A.
 * @version 1.0
 */
public class Cube {

    private double edge;
    private double volume;

    /**
     * Constructs a cube from an edge
     * @param edge double
     */
    public Cube(double edge)
    {
        this.edge = edge;
        this.volume = Math.pow(edge,3);
    }

    /**
     * Constructs a cube from on of its faces
     * @param square Cube
     */
    public Cube(Square square)
    {
        this.edge = square.getSide();
        this.volume = Math.pow(this.edge,3);
    }

    /**
     * Returns the edge of the cube
     * @return double
     */
    public double getEdge()
    {
        return this.edge;
    }

    /**
     * Returns the volume of the cube
     * @return double
     */
    public double getVolume()
    {
        return this.volume;
    }
}
