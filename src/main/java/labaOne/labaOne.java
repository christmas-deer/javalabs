package labaOne;

import java.lang.Math;

public class labaOne {
    static final int RANDOM_MAX_VALUE = 20;

    public static void main(String[] args) {
        int[][] matrixA = new int[5][5];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixA[i][j] = (int) (Math.random() * RANDOM_MAX_VALUE);
            }
        }
        System.out.println("Matrix:");
        for (int i = 0; i < matrixA.length; i++, System.out.println()) {
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
        }

        int sumMatrix = 0;
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                sumMatrix += matrixA[i][j];
            }
        }
        System.out.print("Sum of matrix values = " + sumMatrix + "\n");

        int min = matrixA[0][0];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                int matrixElement = matrixA[i][j];
                if (min > matrixElement)
                    min = matrixElement;
            }
        }
        System.out.print("Minimum = " + min + "\n");

        int max = matrixA[0][0];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                if (max < matrixA[i][j])
                    max = matrixA[i][j];
            }
        }
        System.out.print("Maximum = " + max);
    }
}


