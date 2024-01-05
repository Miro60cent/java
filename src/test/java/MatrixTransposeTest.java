import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MatrixTransposeTest {
    private MatrixTranspose transposer;

    @Before
    public void setUp() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        transposer = new MatrixTranspose(matrix);
    }

    @Test
    public void testTransposeMatrix() {
        int[][] expectedTransposedMatrix = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };
        int[][] actualTransposedMatrix = transposer.transposeMatrix();
        assertArrayEquals(expectedTransposedMatrix, actualTransposedMatrix);
    }

    @Test(expected = NullPointerException.class)
    public void testTransposeMatrixWithNullMatrix() {
        transposer = new MatrixTranspose(null);
        transposer.transposeMatrix();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTransposeMatrixWithEmptyMatrix() {
        transposer = new MatrixTranspose(new int[0][0]);
        transposer.transposeMatrix();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testTransposeMatrixWithNonSquareMatrix() {
        int[][] nonSquareMatrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        transposer = new MatrixTranspose(nonSquareMatrix);
        transposer.transposeMatrix();
    }
}
