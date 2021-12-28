/************ El Paso Community College - COSC 1437 ***************
 * Author: Christian Servin                                       *
 * File Name: Recursion3                                          *
 * Description:                                                   *
 * Another class that demonstrates the recursive methods          *
 *****************************************************************/
public class Recursion3{
  /**
   * Write a recursive method, vowels, that returns 
   * the number of vowels in a string. Also write a program
   * to test your program
   */
  public static int vowels(String s){
    int counter = 0;
    for(int i = 0; i < s.length();i++){
      char tmp = s.charAt(i);
      if(tmp=='a'||tmp=='e'||tmp=='i'||tmp=='o'||tmp=='u')
        counter++;
    }
    return counter;
  }
  public static int vowelsR(String s, int i){
    // base case
    if(i == s.length()){
      return 0;
    }
    // recursive case 1. When you DID find a vowel
    if(s.charAt(i)=='a'|| s.charAt(i)=='e'||
       s.charAt(i)=='i'|| s.charAt(i)=='o'||
       s.charAt(i)=='u'){
      return 1 + vowelsR(s,i+1);
    }
    // recursive case 1. When you did NOT find a vowel
    else
      return 0 + vowelsR(s,i+1);
  }
  
  public static void main(String []args){
    System.out.println(vowelsR("apple",0));
  }
}
