/**
 *  Program Name: RecursionExample01.java
 *   Description: Program demonstrates how to use the russian dolls algorithm
 *                to transform an iterative implementation into a recursive one.
 * Related class: N/A
 *         Input: N/A
 *          args: N/A
 *        Output: Factorial of 5.
 *        Author: Christian Servin, Ph.D.
 *       Contact: dr.christian.servin@gmail.com
 *                Copyright 2022, Christian Servin, Ph.D.
 *                Version 1.0
 **/

public class RecursionExample01{
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
        // Optional Step: Simplify more by using conditional (ternary) operators.
    public static int factorial(int n){
        //    Conditonal        if           else
        return (n >= 1) ? n * factorial(--n) : 1;
    }
    
        /* Step 6 (FINAL): Add the accumulator onto the self call statement (i.e., the stack)
    public static int factorial(int n){
        // Conditional statement on if slightly changed to make more semantically sense.
        if(n >= 1){
            return n * factorial(--n);
        }
        else{
            return 1;
        }
    }
    
        /* Step 5: Achieving elegancy by improving the number of arguemnts:
              * Use control variables instead of irrelevant ones (e.g. i).
              * Interchange postfix operations into prefix, e.g., x++ as ++x.
    public static int factorial(int n, int f){
        if(1 <= n){
            f *= n;
            return factorial(--n, f);
        }
        else{
            return f;
        }
    }
    
        /* Step 4: Separate local variables into method's arguments & update calls.
    public static int factorial(int n, int f, int i){
        if(i <= n){
            f *= i;
            i++;
            return factorial(n, f, i);
        }
        else{
            return f;
        }
    }

        /* Step 3: Implement a recursive call inside the if statement. If
           the method is void, only call the method. Else, use a return
           statement along with the method call.
    public static int factorial(int n){
        int f = 1;  // Accumulator for the state of i
        int i = 1;
        if(i <= n){
            f *= i;
            i++;
            return factorial(n);
        }
        else{
            return f;
        }
    }

        /* Step 2: Define what is inside of the loop as the base case by
           changing it to a if statement, and use else for what is outside
           of it to define the recursive case.
    public static int factorial(int n){
        int f = 1;  // Accumulator for the state of i
        int i = 1;
        if(i <= n){
            f *= i;
            i++;
        }
        else{
            return f;
        }
    }

        /* Step 1: Use a while loop if it is not already in use.
    public static int factorial(int n){
        int f = 1;  // Accumulator for the state of i
        int i = 1;
        while(i <= n){
            f *= i;
            i++;
        }
        return f;
    }

        /* Initial iterative implementation
    public static int factorial(int n){
        int f = 1;  // Accumulator for the state of i
        for(int i = 1; i <= n; ++i){
            f *= i;
        }
        return f;
    }
        */
}