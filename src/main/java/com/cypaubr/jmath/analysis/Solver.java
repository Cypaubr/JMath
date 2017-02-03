package com.cypaubr.jmath.analysis;

public class Solver {

    private Function toSolve;

    public Solver(Function function){
        this.toSolve = function;
    }

    public Function getFunction(){
        return toSolve;
    }
}
