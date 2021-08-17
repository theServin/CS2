/**
 * Program Name:
 *               ExceptionHandling01.java
 *  Description: 
 *               Program demonstrates how to handle exceptions using try and catch statements.
 *       Output:
 *               Division: 1 
 *       Author: 
 *               Christian Servin, Ph.D.
 *      Contact:
 *               dr.christian.servin@gmail.com
 *               Copyright 2019, Christian Servin
 *               Version 1.0
 * */
import java.util.*;                                                  // imports all .util package
public class ExceptionHandling01{                                    // class header
  public static void main(String [] args){                           // main method header
    Scanner input = new Scanner(System.in);                          // create Scanner object
    try{                                                             // begin try block
      System.out.println("enter number");                            // request infomation from user
      int x = input.nextInt();                                       // variable declaration and initialization
      System.out.println("enter number");                            // request infomation from user
      int y = input.nextInt();                                       // variable declaration and initialization
      int z = x/y;                                                   // divison calculation
      System.out.println("Division: "+z);                            // prints quotient 
    }                                                                // close try block
    catch(ArithmeticException e1){                                   // catch ArithmeticException exception block
      System.out.println("Cannot divide by zero");                   // print statement
    }                                                                // close catch block
    catch(InputMismatchException e2){                                // catch InputMismatchException exception block 
      System.out.println("...really? ... that is not a number...");  // print statement
    }                                                                // close catch block 
  }                                                                  // close main
}                                                                    // close class