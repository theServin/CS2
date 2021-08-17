import java.util.*;

public class ExceptionExample2C{
  public static void main(String[] args)throws COSC1436ExceptionC{
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter the size of an array");
    int size = sc.nextInt();
    if(size < 0 || size > Integer.MAX_VALUE){
      throw new COSC1436ExceptionC("I dont like that input size!!!");
    }
    int[] array = new int[size];      
    System.out.println("Enter a value to store in the array");
    int value = sc.nextInt();
    System.out.println("Which index you want to store it? [0,"+(size-1)+"]");
    int p = sc.nextInt();
    if(p < 0 || p > size){
      throw new COSC1436ExceptionC("out of the range for array");
    }
    array[p] = value;
    for(int x : array)
      System.out.println(x);
    
    
  }
}
