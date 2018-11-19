package labaFive;

import java.util.List;
import java.util.Objects;

public class Matrix {
    private int columnsCount;
    private int rowCount;
    private List<List<Integer>> matrixBody;
    private String author = "Miasoid T.";

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getColumnsCount() {
        return columnsCount;
    }

    public void setColumnsCount(int columnsCount) {
        this.columnsCount = columnsCount;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public List<List<Integer>> getMatrixBody() {
        return matrixBody;
    }

    public void setMatrixBody(List<List<Integer>> matrixBody) {
        this.matrixBody = matrixBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return rowCount == matrix.rowCount &&
                columnsCount == matrix.columnsCount &&
                Objects.equals(author, matrix.author) &&
                Objects.equals(matrixBody, matrix.matrixBody);
    }
}
