/************ El Paso Community College - COSC 1437 ***************
 * Author: Christian Servin                                       *
 * File Name: Recursion2                                          *
 * Description:                                                   *
 * Class will demonstrate the factorial method with iterative     *
 * implementation and recursive implementation.                   *
 *****************************************************************/
public class Recursion2{
  public static void main(String [] args){
    System.out.println(fR(5));
    
  }
  /**
   * factorial (iterative version)
   * Given a number n, this method will return the factorial of n 
   * i.e., n!. 
   * E.g., 5! = 5 * 4 * 3 * 2 * 1 = 120
   *@param n The number whose factorial would like to be calculated
   *@return an int representing the factorial of n
   **/
  public static int f(int n){
    int p = 1;
    for(int i = 1; i <= n; i++)
      p*=i;
    return p;
  }
  /**
   * factorial (recursive version)
   * Given a number n, this method will return the factorial of n 
   * i.e., n!. 
   * E.g., 5! = 5 * 4 * 3 * 2 * 1 = 120
   *@param n The number whose factorial would like to be calculated
   *@return an int representing the factorial of n
   **/
  public static int fR(int n){
    // base case stops
    if(n == 1)
      return 1;
    // recursive case continue
    else
      return n * fR(n-1);
  }
}