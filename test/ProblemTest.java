
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProblemTest {
    @Test
    public void testDisplayFinancialProblem() {
        int actual = Problem.displaySpiritualProblem(1);
        String expected = "problem";
        assertEquals(expected, actual);

    }
    @Test
    public void testAddProblem() {
        int actual = Problem.addProblem(1);
        String expected = "problem";
        assertEquals(expected, actual);

    }

}