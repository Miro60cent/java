public class MatrixTranspose {

  int[][] matrix;
  private final int numRows;
  private final int numCols;

  public MatrixTranspose(int[][] matrix) {
    this.matrix = matrix;
    this.numRows = matrix.length;
    this.numCols = matrix[0].length;
  }

  public int[][] transposeMatrix() {
    if (matrix == null) {
      throw new NullPointerException("The matrix has not been initialized.");
    }
    if (numCols <= 0) {
      throw new ArrayIndexOutOfBoundsException("Matrix has no columns.");
    }
    if (numRows <= 0) {
      throw new ArrayIndexOutOfBoundsException("Matrix has no rows.");
    }
    if (numRows != numCols) {
      throw new UnsupportedOperationException("Only square matrices can be transposed.");
    }

    int[][] transposedMatrix = new int[numCols][numRows];

    for (int i = 0; i < numRows; i++) {
      for (int j = 0; j < numCols; j++) {
        transposedMatrix[j][i] = matrix[i][j];
      }
    }
    return transposedMatrix;
  }

  public void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int num : row) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }
}
