package labaTwo;

public class MatrixManager {

    public int findMax(Matrix matrix) {
        int max = matrix.getData()[0][0];
        for (int i = 0; i < matrix.getRowCount(); i++) {
            for (int j = 0; j < matrix.getColumnsCount(); j++) {
                if (max < matrix.getData()[i][j])
                    max = matrix.getData()[i][j];
            }
        }
        return max;
    }

    public int findMin(Matrix matrix) {
        int min = matrix.getData()[0][0];
        for (int i = 0; i < matrix.getRowCount(); i++) {
            for (int j = 0; j < matrix.getColumnsCount(); j++) {
                if (min > matrix.getData()[i][j])
                    min = matrix.getData()[i][j];
            }
        }
        return min;
    }

    public int countSum(Matrix matrix) {
        int sumMatrix = 0;
        for (int i = 0; i < matrix.getRowCount(); i++) {
            for (int j = 0; j < matrix.getColumnsCount(); j++) {
                sumMatrix += matrix.getData()[i][j];
            }
        }
        return sumMatrix;
    }

    public Matrix createRandomMatrix(int columnsCount, int rowCount, int delta) {
        Matrix matrix = new Matrix();
        matrix.setColumnsCount(columnsCount);
        matrix.setRowCount(rowCount);
        matrix.setData(new int[rowCount][columnsCount]);

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                matrix.getData()[i][j] = (int) (Math.random() * delta);
            }
        }

        return matrix;
    }

    public void printMatrix(Matrix matrix) {
        int rowCount = matrix.getRowCount();
        int columnsCount = matrix.getColumnsCount();
        System.out.println("Matrix:");
        for (int i = 0; i < rowCount; i++, System.out.println()) {
            for (int j = 0; j < columnsCount; j++) {
                System.out.print(matrix.getData()[i][j] + " ");
            }
        }
    }

}
