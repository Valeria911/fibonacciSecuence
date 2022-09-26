package series;

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
