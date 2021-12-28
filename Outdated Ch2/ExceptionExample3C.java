import java.util.*;
public class ExceptionExample3C{
  
  public static void main(String[] args){
    try{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a value between [0,50]: ");
      int value = sc.nextInt();
      int random = getRandomNumber(value);
      System.out.println("You enter: "+value+" and the random is: "+random);
    }
    catch(IllegalArgumentException e){
      System.out.println(e.getMessage());
//      e.printStackTrace();
    }
    finally{
      System.out.println("thank you for visiting..");
    }
    
    
  }
  
  /**
   * generate a random number between
   * 0 and the number provided by the user
   *@param, n a number.
   * Restriction the number n cannot be 
   * greater than 50 or smaller than 0
   **/
  public static int getRandomNumber(int n){
    if(n<0 || n > 51)
      throw new IllegalArgumentException("hey, "+n+" is out the range");
    return (int)(Math.random()*n);
    
  }
  
}
