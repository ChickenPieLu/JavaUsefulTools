package src.main.java;

import src.main.java.Matrix.*;

public class Main {
    public static void main(String[] args) {
        double[][] m = {{1,2},{3,4}};
        double[][] n = {{5,6},{7,8}};
        Matrix a = new Matrix(m);
        Matrix b = new Matrix(n);
        System.out.println(MatrixOps.add(a, b));
        System.out.println(MatrixOps.transpose(a));
        System.out.println(MatrixOps.scalarMult(a,4));

    }

}
