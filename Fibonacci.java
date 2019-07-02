public class Fibonacci {
    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        Long result = fibonacciWithRecursion(50L);
        System.out.println("result of fibonacciWithRecursion is " + result);
        System.out.println("using " + (System.currentTimeMillis() - start) + " ms");
        
        start = System.currentTimeMillis();
        result = fibonacciWithoutRecursion(50L);
        System.out.println("result of fibonacciWithoutRecursion is " + result);
        System.out.println("using " + (System.currentTimeMillis() - start) + " ms");
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
        Long current = 0L;
        Long p1 = 0L;
        Long p2 = 0L;
        Long sum = 0L;
        while (current < input) {
            if (current == 0L || current == 1L) {
                p1 = current;
            }
            sum = p1 + p2;
            p2 = p1;
            p1 = sum;
            current++;  
        }
        return sum;
    }

}