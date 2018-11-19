package labaTwo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixManagerTest extends MatrixManager {
    private final static int ROWS_COUNT = 2;
    private final static int COLUMN_COUNT = 2;
    MatrixManager matrixManager;
    Matrix matrix;

    @Before
    public void init() {
        matrixManager = new MatrixManager();
        matrix = new Matrix();
        matrix.setRowCount(ROWS_COUNT);
        matrix.setColumnsCount(COLUMN_COUNT);
        int[][] matrixData = new int[ROWS_COUNT][COLUMN_COUNT];
        int number = 1;
        for (int i = 0; i < matrix.getRowCount(); i++) {
            for (int j = 0; j < matrix.getColumnsCount(); j++) {
                matrixData[i][j] = number;
                number++;
            }
        }
        matrix.setData(matrixData);
    }

    @Test
    public void findMax() {
        assertEquals(4, matrixManager.findMax(matrix));
    }

    @Test
    public void findMin() {
        assertEquals(1, matrixManager.findMin(matrix));
    }

    @Test
    public void countSum() {
        int summa = matrixManager.countSum(matrix);
        assertEquals(10, summa);
    }
}
