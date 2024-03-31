import java.util.stream.IntStream;

public class ParallelStreamDemo  {
    public static void main(String[] args) {
        long start =0;
        long end = 0;

        // Single core execute
        start = System.currentTimeMillis();
        IntStream.range(0, 10).forEach(e -> System.out.println(Thread.currentThread().getName() + " prints " + e));
        end = System.currentTimeMillis();
        System.out.println();
        System.out.println("Single core execution time: " + (end - start) + "ms");
        System.out.println("======================"); 
        // Parallel run 
        start = System.currentTimeMillis();
        IntStream.range(0, 10).parallel().forEach(e -> System.out.println(Thread.currentThread().getName() + " prints " + e));
        end = System.currentTimeMillis();
        System.out.println();
        System.out.println("Parallel multi core execution time: " + (end - start) + "ms");

    }
}
