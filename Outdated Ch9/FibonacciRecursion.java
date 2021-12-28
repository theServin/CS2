import java.util.Scanner;
public class FibonacciRecursion{
    public static void main(String[] args) {
        //  0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + ....
        // base case
        // recusive case
        System.out.println("n = \t\t fib(n)");
        for (int i = 0; i <= 10; i++) {
            System.out.println("n = "+i+"\t\t"+fib(i));
        }
        

    }
    public static int fib(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }
}
