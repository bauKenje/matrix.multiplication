/**
 * Created by Администратор on 22.05.2015.
 */
public class Matrix {
    //значения
    public int[][] values;

    //конструктор. colCount - кол-во солбцов, rowCount - кол-во строк
    public Matrix(int colCount, int rowCount){
        this.values = new int[rowCount][colCount];
    }

    // заполнение матрицы случайными значениями от -10 до 10
    public void fillRandomValues(){
        for (int i = 0; i < this.values.length; i++) {
            for (int j = 0; j < this.values[0].length; j++) {
                this.values[i][j] = (int)(Math.random()* 20 - 10);
            }
        }
    }

    // отображение матрицы в консоли
    public void show(String matrixName){
        System.out.println(matrixName);
        for (int i = 0; i < this.values.length; i++) {
            for (int j = 0; j < this.values[0].length; j++) {
                String valueStr = String.valueOf(this.values[i][j]);
                while (valueStr.length() < 6){
                    valueStr = " " + valueStr;
                }
                System.out.print(valueStr);
            }
            System.out.println("\n");
        }

    }

    // умножение матрицы matrixA на matrixB
    public static Matrix multiplication(Matrix matrixA, Matrix matrixB){
        Matrix resultMatrix = new Matrix(matrixB.values[0].length,matrixA.values.length);
        for (int i = 0; i < matrixA.values.length; i++) {
            for (int j = 0; j < matrixB.values[0].length; j++) {
                for (int k = 0; k < matrixB.values.length; k++) {
                    resultMatrix.values[i][j] += matrixA.values[i][k] * matrixB.values[k][j];
                }
            }
        }
        return resultMatrix;
    }
}
