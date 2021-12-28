/**
 * Program Name:
 *               ExceptionHandling02.java
 *  Description: 
 *               Program demonstrates how to print the stack trace.
 *       Output:
 *               Division: 1 
 *       Author: 
 *               Christian Servin, Ph.D.
 *      Contact:
 *               dr.christian.servin@gmail.com
 *               Copyright 2019, Christian Servin
 *               Version 1.0
 * */
import java.util.*;                                                    // imports .util package
public class ExceptionHandling02{                                      // class header
  public static void main(String [] args){                             // main method header
    Scanner input = new Scanner(System.in);                            // create Scanner object
    try{                                                               // begin try block
      System.out.println("enter number");                              // request of infomation from user
      int x = input.nextInt();                                         // variable decalaration and initialization
      System.out.println("enter number");                              // request of infomation from user
      int y = input.nextInt();                                         // variable decalaration and initialization
      int z = division(x,y);                                           // divison calculation
      System.out.println("Division: "+z);                              // prints quotient 
    }                                                                  // close try block
    catch(Exception e){                                                // catch block
      e.printStackTrace();                                             // prints stack trace
    }                                                                  // close catch block  
  }                                                                    // close main
  public static int division(int x, int y)throws ArithmeticException{  // division() method header throws the 
                                                                       // ArithmeticException 
    return x / y;                                                      // return calculation
  }                                                                    // close division() method
}                                                                      // close class
