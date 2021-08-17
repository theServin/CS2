/************ El Paso Community College - COSC 1437 ***************
 * Author: Christian Servin                                       *
 * File Name: Recursion1                                          *
 * Description:                                                   *
 * Class will demonstrate how to write simple recursive methods   *
 * instead of iteratives. The methods are based in tail and head  *
 * recursion                                                      *
 *****************************************************************/
public class Recursion1{
  
  public static void main(String [] args){
    printR(5);
  }
  /**
   * Write a method that given an int n
   * will print "Hello" n times
   */
   public static void print(int n){
     for(int i =0; i< n; i++)
       System.out.println("Hello");
   }

  /**
   * Lets convert the method print into recursion
   */
  public static void printR(int n){
    // base case
    if(n==0)
      return;
    // recursive case
    else{
      System.out.println("Hello");
      printR(n-1);
    }
  }
  public static void printR2(int n){
    // base case
    if(n>0){
      System.out.println("Hello");
      printR2(n-1);
    }
  }
  
}