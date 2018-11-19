package labaFour;

import java.util.ArrayList;
import java.util.List;

public class MatrixManager {
    public Matrix createRandomMatrix(int columnsCount, int rowCount, int delta) {
        Matrix matrix = new Matrix();
        matrix.setColumnsCount(columnsCount);
        matrix.setRowCount(rowCount);
        List<List<Integer>> listMatrix = new ArrayList<List<Integer>>();

        for (int i = 0; i < rowCount; i++) {
            listMatrix.add(new ArrayList<Integer>());
            for (int j = 0; j < columnsCount; j++) {
                listMatrix.get(i).add((int) (Math.random() * delta));
            }
        }
        matrix.setMatrixBody(listMatrix);
        return matrix;
    }

    public void printMatrix(Matrix matrix) {
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.getRowCount(); i++) {
            for (int j = 0; j < matrix.getColumnsCount(); j++) {
                System.out.print(matrix.getMatrixBody().get(i).get(j) + "\t");
            }
            System.out.println();
        }
    }

    public int findMax(Matrix matrix) {
        int max = matrix.getMatrixBody().get(0).get(0);
        for (int i = 0; i < matrix.getRowCount(); i++) {
            for (int j = 0; j < matrix.getColumnsCount(); j++) {
                if (max < matrix.getMatrixBody().get(i).get(j))
                    max = matrix.getMatrixBody().get(i).get(j);
            }
        }
        return max;
    }

    public int findMin(Matrix matrix) {
        int min = matrix.getMatrixBody().get(0).get(0);
        for (int i = 0; i < matrix.getRowCount(); i++) {
            for (int j = 0; j < matrix.getColumnsCount(); j++) {
                if (min > matrix.getMatrixBody().get(i).get(j))
                    min = matrix.getMatrixBody().get(i).get(j);
            }
        }
        return min;
    }

    public int countSum(Matrix matrix) {
        int sumMatrix = 0;
        for (int i = 0; i < matrix.getRowCount(); i++) {
            for (int j = 0; j < matrix.getColumnsCount(); j++) {
                sumMatrix += matrix.getMatrixBody().get(i).get(j);
            }
        }
        return sumMatrix;
    }
}
