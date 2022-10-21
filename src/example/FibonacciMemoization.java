package example;

import java.util.Arrays;

public class FibonacciMemoization implements Fibonacci{
    static final int FIXED_ARRAY_SIZE = 10;
    long[] cache = new long[FIXED_ARRAY_SIZE];
    @Override
    public long fibonacci(long n) {
        if(n <= 1) return n;
        int index = (int) n - 2;
        // Resizing array
        if(cache.length - 1  < index)
            cache = Arrays.copyOf(cache, cache.length + FIXED_ARRAY_SIZE);
        // Computing cache
        if(cache[index] == 0)
            cache[index] = fibonacci(n - 1) + fibonacci(n -2 );
        return cache[index];
    }
}
