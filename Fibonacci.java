public class Fibonacci {
    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        Long result = fibonacciWithRecursion(30L);
        System.out.println("result of fibonacciWithRecursion is " + result);
        System.out.println("using " + (System.currentTimeMillis() - start) + " ms");
        
        fibonacciWithoutRecursion(10L);
    }

    public static Long fibonacciWithRecursion(Long input) {
        if (input == 0L || input == 1L) {
            return input;
        }
        Long r1 = fibonacciWithRecursion(input-1);
        Long r2 = fibonacciWithRecursion(input-2);
        return r1 + r2;
    }

    public static void fibonacciWithoutRecursion(Long input) {
        System.out.println("input is " + input);
    }

}