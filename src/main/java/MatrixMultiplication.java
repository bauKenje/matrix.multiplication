/**
 * Created by Администратор on 22.05.2015.
 */
public class MatrixMultiplication {
    public static void main(String[] args) {
        Matrix matrixA = new Matrix(3,2);
        Matrix matrixB = new Matrix(4,3);
        matrixA.fillRandomValues();
        matrixB.fillRandomValues();
        matrixA.show("A");
        matrixB.show("B");
        Matrix resultMatrix = Matrix.multiplication(matrixA, matrixB);
        resultMatrix.show("Result");
    }
}
