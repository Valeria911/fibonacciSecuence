package series;

public class FibonacciMemoizacion {
    //método que mejora rendimiento almacenando valores en arrays, de modo que no se vuelvan a calcular cada vez
    public long [] fibonacciArray = new long[26];

    public long fibonacci(long n){
        long fibonacciValue = 0;
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
