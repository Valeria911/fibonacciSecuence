package series;

public class FibonacciIterativo {
    //clase con algoritmo usando ciclo for
    public long fibonacciIterativo(long posicion) {
        //declaracion de variables a utilizar
        long actual = 0;
        long siguiente = 1;
        long temporal = 0;

        //ciclo para iterar
        for (long i = 1; i <= posicion; i++) {
            //mostrar valores por consola
            System.out.println(actual + ", ");
            temporal = actual;
            actual = siguiente;
            siguiente = siguiente + temporal;
        }
        System.out.println(actual);
        return actual;
    }
}
