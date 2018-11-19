package labaFour;

public class Main {
    public static void main(String[] args) {
        MatrixManager matrixManager = new MatrixManager();
        Matrix matrix = matrixManager.createRandomMatrix(6, 6, 30);
        matrixManager.printMatrix(matrix);
        System.out.print("Maximum = " + matrixManager.findMax(matrix) + "\n");
        System.out.print("Minimum = " + matrixManager.findMin(matrix) + "\n");
        System.out.print("Sum of matrix values = " + matrixManager.countSum(matrix) + "\n");
        System.out.print("Author = " + matrix.getAuthor() + "\n");
    }
}
