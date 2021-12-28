/************ El Paso Community College - COSC 1437 ***************
 * Author: Christian Servin                                       *
 * File Name: RecursionExample01                                  *
 * Description:                                                   *
 * This class demonstrates the usage of the three recursive       *
 * examples and their correspodning loop implementation           *
 * 1. print                                                       *
 * 2. factorial                                                   *
 * 3. addRange                                                    *
 *****************************************************************/
public class RecursionExample01{
  public static void main(String [] args){
    print(10);
  }
  public static void print(int n){
    // base case
    if(n == 10000)
      return;
    // recursive case
    else{
//      System.out.println("hello");
      print(n-1);
    }
  }
  
//  public static void print(int n){
//    for(int i = 0; i < n; i++)
//      System.out.println("hello");
//  }
  public static int factorial(int n){
    if(n == 1)
      return 1;
    else
      return n * factorial(n-1);
  }
//  public static int factorial(int n){
//    int accumulator = 1;
//    for(int i = n; i >=1; i--){
//      accumulator *= i;
//    }
//    return accumulator;
//  }
  /**
   * write a recursive method named addRange
   * This method will take 3 parameters
   * 1. a, is an array of ints
   * 2. s, is an int representing the starting index
   * 3. e, is an int representing the ending index
   * This method will return the addition of the 
   * elements in array a from s to e
   **/
  public static int addRange(int[] a, int s, int e){
    if(s == e)
      return a[s];
    else 
      return a[s] + addRange(a,s+1,e);
  }
  
  
  
  
  
}
