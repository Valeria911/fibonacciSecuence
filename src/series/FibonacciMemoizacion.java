package series;

/**
 * TODO
 *  1. ¿Cómo se mejora para que el "cache" sea dinámico? Fibonacci(30) explota
 */

public class FibonacciMemoizacion {
    /* TODO
        1. ¿Debería ser público?
        2. Si Fibonacci(0) y Fibonacci(1) no deben ser calculados, fibonacciArray podría ser de tamaño
         n-1 cuando n>1
     */
    //método que mejora rendimiento almacenando valores en arrays, de modo que no se vuelvan a calcular cada vez
    public long [] fibonacciArray = new long[26];

    public long fibonacci(long n){
        long fibonacciValue = 0;
        /* TODO
            Estos one-line-if pueden ser simplificados.
            if(condition1) return x;
            else if (condition2 return y;
            Además "se puede hacer trampa" para Fibonacci(0) y Fibonacc(1):
            if(n<=1) return n;
         */
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (fibonacciArray[(int)n] != 0) {
            return fibonacciArray[(int)n];
        } else {
            fibonacciValue = fibonacci(n - 1) + fibonacci(n - 2);
            fibonacciArray[(int)n] = fibonacciValue;
            return fibonacciValue;
        }
    }

}
