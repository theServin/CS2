/************ El Paso Community College - COSC 1437 ***************
 * Author: Christian Servin                                       *
 * File Name: RecursionExample03                                  *
 * Description:                                                   *
 * This class demonstrates the usage of the Recursion             *
 *****************************************************************/
public class RecursionExample03{
  public static void main(String [] args){
    int counter = findVowels("apple bees");
    System.out.println(counter);
  }
  /* write recursive method: findVowels()
   * This method will take a:
   * String s, as a parameter, and will 
   * return a number representing the total 
   * number of vowels in the String s.
   * A Vowel is either:
   *        a e i o u
   * E.g., if s = "apple bees"
   *  Your method shall return 4.
   **/
  public static int findVowels(String s){
    return findVowels(s,0);
  }
  /*
   * private methods are used as an internal mechanism to perform the 
   * operations you want. Usually, recursive methods use  "helpers" 
   * (i.e., private methods) to provide that extra parameter (dummy 
   * variables) that we cannot use inside the method.
   *
   * Since we need to navegate through the entire String s and extract 
   * character by character. That's why we need to use the charAt(p) 
   * method from String. This method needs a position 'p' that will 
   * keep changing. Internally we use an additional parameter 'p' that 
   * will keep track of the current position. Since we don't have
   * dummy variables in recursion, this will serve as the update
   */
  public static int findVowels(String s, int p){
    // base case: If you reached the end of the String, means that 
    // there is nothing to add
    if(p == s.length())
      return 0;
    // recursive case 1: This recursive case can be combined with a 
    // "base case" since we know that once we find a vowel we need to 
    // add 1 to the current "accumulator" 
    else if(s.charAt(p)=='a' || s.charAt(p)=='e' ||
            s.charAt(p)=='i' || s.charAt(p)=='o' ||
            s.charAt(p)=='u'){
      return 1 + findVowels(s,p+1);
    }
    // recursive case 2: In case you did not find the
    // vowel AND you still characters to read in the 
    // String, just update your position to 1 more.
    else
      return findVowels(s,p+1);
  }
}
