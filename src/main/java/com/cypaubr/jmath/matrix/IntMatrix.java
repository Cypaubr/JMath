package com.cypaubr.jmath.matrix;

/**
 * This class defines a simple integer matrix
 * @author Cyprien A.
 * @version 1.0
 */
public class IntMatrix {

    private int[][] matrix;

    public IntMatrix(int[][] matrix){
        this.matrix = matrix;
    }

    /**
     * Returns the length of a row
     * @return int
     */
    public int rowLength(){
        return matrix[0].length;
    }

    /**
     * Returns the length of a column
     * @return int
     */
    public int columnLength(){
        return matrix.length;
    }

    /**
     * Returns the number of elements in the matrix
     * @return int
     */
    public int length(){
        return matrix.length * matrix[0].length;
    }

    /**
     * This method returns the matrix as a visual array
     * @return String
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<matrix.length; i++){
            sb.append('|');
            for (int j=0; j<matrix[i].length; j++){
                sb.append(matrix[i][j]);
                sb.append(',');
            }
            sb.append('|');
            sb.append("\r\n");
        }
        return sb.toString();
    }
}
