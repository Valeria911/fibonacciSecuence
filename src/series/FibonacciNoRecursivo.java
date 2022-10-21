package series;

/* TODO
 *  1. Si quisiera el resultado, la función no puede ser de tipo void
 *  2. Si n3 es el resultado de Fibonacci(n), entonces Fibonacci(0) y Fibonacci(1)
 *   serían null
 *  3. Si n3 es el resultado, Fibonacci(n) está calculando Fibonacci(n+1)
 *
 */

public class FibonacciNoRecursivo {

    public void fibonacci(int n){
        int n1 = 0;
        int n2 = 1;
        int n3;

        System.out.println(n1);
        System.out.println(n2);
        for (int j = 0; j < n; j++) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
