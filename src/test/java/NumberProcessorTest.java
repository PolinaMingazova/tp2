import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

@Timeout(value = 200, unit = TimeUnit.MILLISECONDS)
public class NumberProcessorTest {

    @Test
    public void testMin() {
        String fileName = "testMin.txt";
        long[] numbers = NumberProcessor.getList(fileName);
        long minNumber = NumberProcessor.min(numbers);
        assertEquals(minNumber, 1);
    }

    @Test
    public void testMax() {
        String fileName = "testMax.txt";
        long[] numbers = NumberProcessor.getList(fileName);
        long maxNumber = NumberProcessor.max(numbers);
        assertEquals(maxNumber, 10);
    }

    @Test
    public void testSum() {
        String fileName = "testSum.txt";
        long[] numbers = NumberProcessor.getList(fileName);
        long sumNumber = NumberProcessor.sum(numbers);
        assertEquals(sumNumber, 55);
    }

    @Test
    public void testMult() {
        String fileName = "testMult.txt";
        long[] numbers = NumberProcessor.getList(fileName);
        long multNumber = NumberProcessor.mult(numbers);
        assertEquals(multNumber, 3628800);
    }

    @Test
    @Disabled
    public void testTimeout() {
        String fileName = "testMin.txt";
        assertTimeout(ofMillis(200), () -> {
            Thread.sleep(200);
        });
        long[] numbers = NumberProcessor.getList(fileName);
        long minNumber = NumberProcessor.min(numbers);
        long maxNumber = NumberProcessor.max(numbers);
        long sumNumber = NumberProcessor.sum(numbers);
        long multNumber = NumberProcessor.mult(numbers);

    }

    @Test
    @Disabled
    public void testException() {
        String fileName = "testMin.txt";
        long[] numbers = NumberProcessor.getList(fileName);
        assertThrows(ArithmeticException.class, () -> {
            long multNumber = NumberProcessor.mult(numbers);
        });
    }
}
