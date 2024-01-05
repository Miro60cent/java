public class MatrixColumnAverageCalculator {
    int[][] matrix;

    public MatrixColumnAverageCalculator(int[][] matrix) {
        this.matrix = matrix;
    }

    public double[] calculateColumnAverages() {
        if (matrix == null) {
            throw new NullPointerException("The matrix has not been initialized.");
        }

        if (matrix.length == 0) {
            throw new ArithmeticException("Matrix cannot be empty");
        }

        int numRows = matrix.length;
        int numCols = matrix[0].length;

        double[] columnAverages = new double[numCols];

        for (int j = 0; j < numCols; j++) {
            int columnSum = 0;
            for (int i = 0; i < numRows; i++) {
                columnSum += matrix[i][j];
            }
            columnAverages[j] = (double) columnSum / numRows;
        }
        return columnAverages;
    }
}
