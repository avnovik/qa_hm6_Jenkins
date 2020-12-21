import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SimpleTest {

    @Step
    public static void checkSumStep(int num1, int num2, int expectedSum) {
        assertEquals(num1 + num2 ,expectedSum);
    }

    @Test
    public void simpleTrueTest() {
        checkSumStep(3, 2, 5);
        checkSumStep(5, 4, 9);
    }

    @Test
    public void simpleFalseTest() {
        checkSumStep(2,2,5);
    }
}
