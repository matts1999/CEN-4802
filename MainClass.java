package cen4802;

/**
 * This class provides a method that calculates the nth term of the Fibonacci sequence.
 */
public class MainClass {
    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the sequence is " + result);
    }

    /**
     * Returns the nth term of the sequence.
     *
     * @param n the position in the sequence
     * @return the nth term of the sequence
     */
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
