/************ El Paso Community College - COSC 1437 ***************
 * Author: Christian Servin                                       *
 * File Name: RecursionExample02                                  *
 * Description:                                                   *
 * This class demonstrates the fibonacci series. We provide the   *
 * looped and the recursive implementation.                       *
 * A fibonacci number n, is calculated as:                        *
 *         if n = 0, then f(0) = 0                                *
 * f(n) =  if n = 1, then f(1) = 1                                *
 *         if n>= 2, then f(n) = f(n-1) + f(n-2)                  *
 *****************************************************************/
public class RecursionExample02
{
  
  public static int f(int n){
    // base case
    if(n == 0)
      return 0;
    else if(n == 1)
      return 1;
    else
      return f(n-1) + f(n-2);
  }
  
//  public static int f(int n){
//    int a = 0;
//    int b = 1;
//    int c = a + b;
//    for(int i = 2; i<=n; i++){
//      c = (a+b);
//      a = b;
//      b = c;
//    }
//    return c;
//  }
}
