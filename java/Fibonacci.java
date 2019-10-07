package rr.jittest;

/**
 * Class used to calculate the fibonacci of some number many times and
 * each time print the total time it took to calculate the value
 * @author Rodrigo Ramirez
 */
public class Fibonacci {

    /**
     * Calculates the Fibonacci of n :
     * @param n
     * @return f(n)
     */
    public static int f(int n) {
        if (n <= 2) {
            return 1;
        }
        int n1 = 1;
        int n2 = 1;
        int result = 0;

        for(int i = 3; i <= n; i++ ) {
            result = n1 + n2;
            n2 = n1;
            n1 = result;
        }

        return result;
    }


    /**
     * Prints the average time it takes to calculate f(n)
     * @param args
     */
    public static void trackExecutionSpeed() {
        System.out.println("Average time to execute f(100) in nanoseconds");
        for(int i = 0; i < 200; i++) {
            long startTime = System.nanoTime();
            for(int j = 0; j < 50; j++) {
                f(100);
            }
            long totalTime = System.nanoTime() - startTime;
            System.out.println(String.format("%f", totalTime / 50.0));
        }
    }

    public static void main(String[] args) {
        trackExecutionSpeed();
    }
}
