import series.FibonacciIterativo;
import series.FibonacciMemoizacion;
import series.FibonacciNoRecursivo;
import series.FibonacciRecursivo;

public class Main {
    public static void main(String[] args) {

        FibonacciNoRecursivo noRecursivo = new FibonacciNoRecursivo();
        long preTime4 = System.currentTimeMillis();
        //indicar el número de posiciones a obtener de la secuencia
        noRecursivo.fibonacci(25);
        long postTime4 = System.currentTimeMillis();
        System.out.println("Tiempo que demoró el método no recursivo: " + (postTime4 - preTime4));

        //método iterativo
        FibonacciIterativo iterativo = new FibonacciIterativo();
        long preTime1 = System.currentTimeMillis();
        iterativo.fibonacciIterativo(25l);
        long postTime1 = System.currentTimeMillis();
        System.out.println("Tiempo que demoró el método iterativo: " + (postTime1 - preTime1));

        //método que se llama a sí mismo
        FibonacciRecursivo recursivo = new FibonacciRecursivo();
        //entrega el número correspondiente a la posición dentro de la secuencia de fibonacci
        long preTime2 = System.currentTimeMillis();
        System.out.println(recursivo.fibonacci(25));
        long postTime2 = System.currentTimeMillis();
        System.out.println("Tiempo que demoró el método recursivo: " + (postTime2 - preTime2));

        //Método recursivo con memoizacion
        FibonacciMemoizacion memoizacion = new FibonacciMemoizacion();
        long preTime3 = System.currentTimeMillis();
        System.out.println(memoizacion.fibonacci(25));
        long postTime3 = System.currentTimeMillis();
        System.out.println("Tiempo que demoró el método con memoización: " + (postTime3 - preTime3));


    }
}