package labaFour;
import java.util.List;

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
    public List<List<Integer>> getMatrixBody() { return matrixBody; }
    public void setMatrixBody(List<List<Integer>> matrixBody) {
        this.matrixBody = matrixBody;
    }
}
