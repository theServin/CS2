/************ El Paso Community College - COSC 1437 ***************
 * Author: Christian Servin                                       *
 * File Name: Recursion3                                          *
 * Description:                                                   *
 * Another class that demonstrates two recursive methods          *
 *****************************************************************/
public class Recursion4{
  public static void main(String [] args){
    int[] a = {1,0,4,6,0};
    int[] b = {3,5,4,0,0};
    int total = repetition(a,b,0);
    System.out.println("Number of times 0 appears: "+total);
    
    String s  = "hello world";
    System.out.println(transform(s));
  }
  /**
   * transform method that will call the recursive one
   *@param s A String whose desired to be transform to upper case
   *@return a String representing s but now all upper case
   */
  public static String transform(String s){
    return transform(s,0);
  }
  /**
   * Private method for transform
   */
  private static String transform(String s, int p){
    if(p == s.length())
      return "";
    else{
      // even number make it upper
      if(p%2 == 0){
        return s.charAt(p)+transform(s.toUpperCase(),p+1);
        //return (s.charAt(p)+"").toUpperCase()+transform(s,p+1);
      }
      else{
        return s.charAt(p)+transform(s.toUpperCase(),p+1);
      }
    }
  }
  /**
   * repetition method that will count the total number of times
   * a tharget t appears in two arrays of ints
   *@param a an array of ints
   *@param b an array of ints
   *@param t a target desired to be found in array a and b
   *@return the total number of times t appeared in a and b
   */
  public static int repetition(int[] a, int[] b, int t){
    return repetition(a,b,t,0);
  }
  /**
   * Private method for repetition
   */
  private static int repetition(int[] a, 
                                int[] b, 
                                int t, 
                                int p){
    //base case
    if(p == a.length || p == b.length)
      return 0;
    else{
      // in case both positions share the same target
      if(a[p] == t && b[p] == t){
        return 2 + repetition(a,b,t,p+1);
      }
      // at least 1 position in arrays share target
      else if(a[p] == t || b[p] == t){
        return 1 + repetition(a,b,t,p+1);
      }
      // if arrays at position p does not match target
      else{
        return repetition(a,b,t,p+1);
      }
    }
  }
}
