/**
 * Program Name:
 *               ExceptionHandling03.java
 *  Description: 
 *               Program demonstrates how to handle exceptions with a unique exception statement.
 *       Output:
 *               Division: 1 
 *       Author: 
 *               Christian Servin, Ph.D.
 *      Contact:
 *               dr.christian.servin@gmail.com
 *               Copyright 2019, Christian Servin
 *               Version 1.0
 * */
import java.util.*;                                                          // import .util package     
public class ExceptionHandling03{                                            // class header
  public static void main(String [] args){                                   // main method header
    Scanner input = new Scanner(System.in);                                  // create Scanner object
    try{                                                                     // begin try block
      System.out.println("enter number");                                    // request infomation from user
      int x = input.nextInt();                                               // variable declaration and initialization
      System.out.println("enter number");                                    // request infomation from user
      int y = input.nextInt();                                               // variable declaration and initialization
      int z = division(x,y);                                                 // divison calculation
      System.out.println("Division: "+z);                                    // prints quotient
    }                                                                        // close try block
    catch(InputMismatchException e1){                                        // catch InputMismatchException exception
                                                                             // block 
      System.out.println(e1);                                                // print statement
    }                                                                        // close catch block 
    catch(ServinAngryException e){                                           // catch ServinAngryException exception
      System.out.println(e);                                                 // print statement
    }                                                                        // close catch block 
    catch(Exception e3){                                                     // catch block
      System.out.println(e3);                                                // print statement
    }                                                                        // close catch block    
  }                                                                          // close main
  public static int division(int x, int y)throws ServinAngryException{       // division() method header that throws 
                                                                             // created ServinAngryException
    if(y == 0)                                                               // conditon to check input
      throw new ServinAngryException("really.... do you think this is"+      // print statement
                                     " a joke! ?... cannot divide by "+
                                      "zero!");
    return x / y;                                                            // returns quotient
  }                                                                          // close division() method
}                                                                            // close class