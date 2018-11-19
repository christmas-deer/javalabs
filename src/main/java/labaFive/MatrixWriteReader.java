package labaFive;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.Writer;


public class MatrixWriteReader {
    private Gson gson = new Gson();

    public void write(Matrix matrix, String filePath) {

        try {
            Writer writer = new FileWriter(filePath);
            gson.toJson(matrix, writer);
            writer.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public Matrix read(String filePath) {
        Matrix matrix = new Matrix();
        try {
            matrix = gson.fromJson(new FileReader(filePath), Matrix.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return matrix;
    }
}
