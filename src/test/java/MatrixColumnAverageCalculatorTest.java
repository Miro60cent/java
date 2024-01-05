import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MatrixColumnAverageCalculatorTest {
    private MatrixColumnAverageCalculator calculator;

    @Before
    public void setUp() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        calculator = new MatrixColumnAverageCalculator(matrix);
    }

    @Test
    public void testCalculateColumnAverages() {
        double[] expectedAverages = {4.0, 5.0, 6.0};
        double[] actualAverages = calculator.calculateColumnAverages();
        assertArrayEquals(expectedAverages, actualAverages, 0.001);
    }

    @Test(expected = NullPointerException.class)
    public void testCalculateColumnAveragesWithNullMatrix() {
        calculator = new MatrixColumnAverageCalculator(null);
        calculator.calculateColumnAverages();
    }

    @Test(expected = ArithmeticException.class)
    public void testCalculateColumnAveragesWithEmptyMatrix() {
        calculator = new MatrixColumnAverageCalculator(new int[0][0]);
        calculator.calculateColumnAverages();
    }
}
