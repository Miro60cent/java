public class Main {
  public static void main(String[] args) {
    int[][] originalMatrix = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };

    try {
      MatrixTranspose matrixTranspose = new MatrixTranspose(originalMatrix);
      MatrixColumnAverageCalculator calculator = new MatrixColumnAverageCalculator(originalMatrix);

      System.out.println("Original Matrix:");
      matrixTranspose.printMatrix(matrixTranspose.matrix);

      int[][] transposedMatrix = matrixTranspose.transposeMatrix();

      System.out.println("Transposed Matrix:");
      matrixTranspose.printMatrix(transposedMatrix);
      System.out.println();

      double[] columnAverages = calculator.calculateColumnAverages();

      for (int j = 0; j < columnAverages.length; j++) {
        System.out.println("Average column " + j + ": " + columnAverages[j]);
      }
    } catch (NullPointerException | IllegalArgumentException | IndexOutOfBoundsException | UnsupportedOperationException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
