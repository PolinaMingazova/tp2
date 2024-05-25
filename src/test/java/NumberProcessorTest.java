import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static java.time.Duration.ofMillis;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Timeout(value = 200, unit = TimeUnit.MILLISECONDS)
public class NumberProcessorTest {

    @Test
    public void testMin() {
        String fileName = "C:\\Users\\Mi\\Documents\\input.txt";
        long[] numbers = NumberProcessor.getList(fileName);
        long minNumber = NumberProcessor.min(numbers);
        assertEquals(minNumber, 1);
    }

    @Test
    public void testMax() {
        String fileName = "C:\\Users\\Mi\\Documents\\input.txt";
        long[] numbers = NumberProcessor.getList(fileName);
        long maxNumber = NumberProcessor.max(numbers);
        assertEquals(maxNumber, 10);
    }

    @Test
    public void testSum() {
        String fileName = "C:\\Users\\Mi\\Documents\\input.txt";
        long[] numbers = NumberProcessor.getList(fileName);
        long sumNumber = NumberProcessor.sum(numbers);
        assertEquals(sumNumber, 55);
    }

    @Test
    public void testMult() {
        String fileName = "C:\\Users\\Mi\\Documents\\input.txt";
        long[] numbers = NumberProcessor.getList(fileName);
        long multNumber = NumberProcessor.mult(numbers);
        assertEquals(multNumber, 3628800);
    }

    @Test
    public void testMinTime() {
        long t1 = System.nanoTime();
        String fileName = "C:\\Users\\Mi\\Documents\\input.txt";
        long[] numbers = NumberProcessor.getList(fileName);
        long minNumber = NumberProcessor.min(numbers);
        long t2 = System.nanoTime();
        System.out.println("MinTime: " + (t2 - t1));
    }

    @Test
    public void testMaxTime() {
        long t1 = System.nanoTime();
        String fileName = "C:\\Users\\Mi\\Documents\\input.txt";
        long[] numbers = NumberProcessor.getList(fileName);
        long maxNumber = NumberProcessor.max(numbers);
        long t2 = System.nanoTime();
        System.out.println("MaxTime: " + (t2 - t1));
    }

    @Test
    public void testSumTime() {
        long t1 = System.nanoTime();
        String fileName = "C:\\Users\\Mi\\Documents\\input.txt";
        long[] numbers = NumberProcessor.getList(fileName);
        long sumNumber = NumberProcessor.sum(numbers);
        long t2 = System.nanoTime();
        System.out.println("SumTime: " + (t2 - t1));
    }

    @Test
    public void testMultTime() {
        long t1 = System.nanoTime();
        String fileName = "C:\\Users\\Mi\\Documents\\input.txt";
        long[] numbers = NumberProcessor.getList(fileName);
        long multNumber = NumberProcessor.mult(numbers);
        long t2 = System.nanoTime();
        System.out.println("MultTime: " + (t2 - t1));
    }

    @Test
    public void testTimeout() {
        String fileName = "C:\\Users\\Mi\\Documents\\input.txt";
        assertTimeout(ofMillis(200), () -> {
            Thread.sleep(100);
        });
        long[] numbers = NumberProcessor.getList(fileName);
        long minNumber = NumberProcessor.min(numbers);
        long maxNumber = NumberProcessor.max(numbers);
        long sumNumber = NumberProcessor.sum(numbers);
        long multNumber = NumberProcessor.mult(numbers);

    }

}