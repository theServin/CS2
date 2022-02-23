/**
 *  Program Name: RecursionExample03.java
 *   Description: Program demonstrates how to use the russian dolls algorithm
 *                to transform an iterative implementation into a recursive one.
 * Related class: N/A
 *         Input: N/A
 *          args: N/A
 *        Output: Occurrences of 'a' character in "banana" String.
 *        Author: Christian Servin, Ph.D.
 *       Contact: dr.christian.servin@gmail.com
 *                Copyright 2022, Christian Servin, Ph.D.
 *                Version 1.0
 **/

public class RecursionExample03{
    public static void main(String[] args) {
        String s = "bananas";
        char c = 'a';
        int i = 0;
        System.out.println(countOccurrences(c, s, i));
    }

    public static int countOccurrences(char c, String s, int i){
        if(i <s.length()){
            if(s.charAt(i) == c){
                return 1 + countOccurrences(c, s, ++i);
            }
            return countOccurrences(c, s, ++i);
        }
        else{
            // We negotiate what the base case returns by returning 0,
            // which is a value that will not affect the sum in the recursion.
            return 0;
        }
    }

        /* Step 5: Achieving elegancy by improving the number of arguemnts:
              * Use control variables instead of irrelevant ones (e.g. i).
              * Interchange postfix operations into prefix, e.g., x++ as ++x.
    public static int countOccurrences(char c, String s, int total, int i){
        if(i <s.length()){
            if(s.charAt(i) == c){
                total++;
            }
            return 1 + countOccurrences(c, s, total, ++i);
        }
        else{
            return total;
        }
    }

        /* Step 4: Separate local variables into method's arguments & update calls.
    public static int countOccurrences(char c, String s, int total, int i){
        if(i <s.length()){
            if(s.charAt(i) == c){
                total++;
            }
            i++;
            return countOccurrences(c, s, total, i);
        }
        else{
            return total;
        }
    }

        /* Step 3: Implement a recursive call inside the if statement. If
           the method is void, only call the method. Else, use a return
           statement along with the method call.
    public static int countOccurrences(char c, String s){
        int total = 0;
        int i = 0;
        if(i <s.length()){
            if(s.charAt(i) == c){
                total++;
            }
            i++;
            return countOccurrences(c, s);
        }
        else{
            return total;
        }
    }

        /* Step 2: Define what is inside of the loop as the base case by
           changing it to a if statement, and use else for what is outside
           of it to define the recursive case.
    public static int countOccurrences(char c, String s){
        int total = 0;
        int i = 0;
        if(i <s.length()){
            if(s.charAt(i) == c){
                total++;
            }
            i++;
        }
        else{
            return total;
        }
    }

        /* Step 1: Use a while loop if it is not already in use.
    public static int countOccurrences(char c, String s){
        int total = 0;
        int i = 0;
        while(i <s.length()){
            if(s.charAt(i) == c){
                total++;
            }
            i++;
        }
        return total;
    }

        /* Initial iterative implementation
    public static int countOccurrences(char c, String s){
        int total = 0;
        for(int i = 0; i <s.length(); ++i){
            if(s.charAt(i) == c){
                total++;
            }
        }
        return total;
    }
        */
}
