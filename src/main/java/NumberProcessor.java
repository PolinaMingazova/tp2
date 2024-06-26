import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NumberProcessor {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\Mi\\Documents\\input.txt";
        long[] numbers = getList(fileName);
        System.out.println("Min: " + min(numbers));
        System.out.println("Max: " + max(numbers));
        System.out.println("Sum: " + sum(numbers));
        System.out.println("Mult: " + mult(numbers));

    }

    public static long[] getList(String fileName) {
        List<Long> numbersList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            if (line != null) {
                String[] numbersString = line.split(" ");
                for (String num : numbersString) {
                    numbersList.add(Long.parseLong(num.trim()));
                }
            }
        } catch (IOException e) {
            System.err.println("ReadFile error: " + e.getMessage());
        }

        long[] numbers = new long[numbersList.size()];
        for (int i = 0; i < numbersList.size(); i++) {
            numbers[i] = numbersList.get(i);
        }
        return numbers;
    }
        
    public static long min(long[] numbers) {
        long t1 = System.nanoTime();
        long min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        long t2 = System.nanoTime();
        System.out.println("MinTime: " + (t2 - t1));
        return min;
    }

    public static long max(long[] numbers) {
        long t1 = System.nanoTime();
        long max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        long t2 = System.nanoTime();
        System.out.println("MaxTime: " + (t2 - t1));
        return max;
    }

    public static long sum(long[] numbers) {
        long t1 = System.nanoTime();
        long sum = 0;
        for (long number : numbers) {
            sum += number;
        }
        long t2 = System.nanoTime();
        System.out.println("SumTime: " + (t2 - t1));
        return sum;
    }

    public static long mult(long[] numbers) {
        long t1 = System.nanoTime();
        long mult = 1;
        for (long number : numbers) {
            mult *= number;
        }
        long t2 = System.nanoTime();
        System.out.println("MultTime: " + (t2 - t1));
        return mult;
    }
}
