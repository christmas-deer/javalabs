package labaFive;

import org.junit.Test;
import org.junit.BeforeClass;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class MatrixWriteReaderTest {
    private final static int ROW = 2;
    private final static int COLUMN = 2;
    private static final String FILE_PATH = "D:\\testLaba5.txt";
    private static Matrix matrix;
    private static MatrixWriteReader matrixWriteRead;

    private static Matrix createBaseMatrix() {
        Matrix matrix = new Matrix();
        matrix.setRowCount(ROW);
        matrix.setColumnsCount(COLUMN);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int count = 1;
        for (int i = 0; i < ROW; i++) {
            list.add(new ArrayList<Integer>());
            for (int j = 0; j < COLUMN; j++) {
                list.get(i).add(count);
                count++;
            }
        }
        matrix.setMatrixBody(list);
        return matrix;
    }

    @BeforeClass
    public static void init() {
        matrix = createBaseMatrix();
        matrixWriteRead = new MatrixWriteReader();
        matrixWriteRead.write(matrix, FILE_PATH);
    }

    @Test
    public void write() throws IOException {
        BufferedReader fin = new BufferedReader(new FileReader(FILE_PATH));
        List<String> listFromFile = new ArrayList<String>();
        List<String> expectedList = new ArrayList<String>();
        expectedList.add("{\"columnsCount\":2,\"rowCount\":2,\"matrixBody\":[[1,2],[3,4]],\"author\":\"Miasoid T.\"}");
        String line;
        while ((line = fin.readLine()) != null) {
            listFromFile.add(line);
        }
        assertEquals(expectedList, listFromFile);
    }

    @Test
    public void readAndWrite() throws IOException {
        Matrix matrixFromFIle = matrixWriteRead.read(FILE_PATH);
        assertEquals(matrix, matrixFromFIle);
    }
}