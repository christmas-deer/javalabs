package labaFive;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        String filePath = "D:\\laba5.txt";
        MatrixManager matrixManager = new MatrixManager();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Matrix matrix = matrixManager.createRandomMatrix(6, 6, 30);

        MatrixWriteReader matrixWriteRead = new MatrixWriteReader();
        matrixWriteRead.write(matrix, filePath);
        Matrix matrixFromFIle = matrixWriteRead.read(filePath);

        matrixManager.printMatrix(matrixFromFIle);
        System.out.print("Maximum = " + matrixManager.findMax(matrixFromFIle) + "\n");
        System.out.print("Minimum = " + matrixManager.findMin(matrixFromFIle) + "\n");
        System.out.print("Sum of matrix values = " + matrixManager.countSum(matrixFromFIle) + "\n");
    }
}
