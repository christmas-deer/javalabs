package labaTwo;

public class Matrix {
    private int columnsCount;
    private int rowCount;
    private int data[][];

    public int getColumnsCount() { return columnsCount; }
    public void setColumnsCount(int columnsCount) {
        this.columnsCount = columnsCount;
    }
    public int getRowCount() {
        return rowCount;
    }
    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }
    public int[][] getData() {
        return data;
    }
    public void setData(int[][] data) {
        this.data = data;
    }
}
