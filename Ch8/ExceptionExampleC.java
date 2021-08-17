import java.util.*;

public class ExceptionExampleC{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in); 
    try{
      System.out.println("Enter the size of an array");
      int size = sc.nextInt();
      int[] array = new int[size];      
      System.out.println("Enter a value to store in the array");
      int value = sc.nextInt();
      System.out.println("Which index you want to store it? [0,"+(size-1)+"]");
      int p = sc.nextInt();
      array[p] = value;
      for(int x : array)
        System.out.println(x);
    }
    catch(NegativeArraySizeException e1){
      System.out.println("sorry sir, the size is negative!!!");
    }
    catch(InputMismatchException e2){
      System.out.println("Invalid value");
    }
    catch(ArrayIndexOutOfBoundsException e3){
      System.out.println("I'm sorry... I think I said between [0,6]!!!");
    }
  }
}