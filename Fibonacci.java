public class Fibonacci {
    public static void main(String[] args) {
        Long start = System.nanoTime();
        Long result = fibonacciWithRecursion(50L);
        System.out.println("result of fibonacciWithRecursion is " + result);
        System.out.println("using " + (System.nanoTime() - start) + " nano");
        
        Long start2 = System.nanoTime();
        Long result2 = fibonacciWithoutRecursion(50L);
        System.out.println("result of fibonacciWithoutRecursion is " + result2);
        System.out.println("using " + (System.nanoTime() - start2) + " nano");
    }

    public static Long fibonacciWithRecursion(Long input) {
        if (input == 0L || input == 1L) {
            return input;
        }
        Long r1 = fibonacciWithRecursion(input-1);
        Long r2 = fibonacciWithRecursion(input-2);
        return r1 + r2;
    }

    public static Long fibonacciWithoutRecursion(Long input) {
        Long current = 2L;
        Long p1 = 1L;
        Long p2 = 0L;
        Long sum = 0L;
        while (current < input) {
            sum = p1 + p2;
            p2 = p1;
            p1 = sum;
            current++;  
        }
        return sum;
    }

}