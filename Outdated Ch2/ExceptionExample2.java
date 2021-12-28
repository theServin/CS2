import javax.swing.*;
// chapter 12
public class ExceptionExample2{
  public static void main(String [] args) throws COSC1436EarlyMorningException{
    String[] array = null;
    
    String input1 = JOptionPane.showInputDialog("Enter a number for the array");
    int n1 = Integer.parseInt(input1);
    if( n1 < 0 || n1 > Integer.MAX_VALUE){
      //throw new COSC1436EarlyMorningException("Dear sleepy student, invalid possible range for: "+n1);
      throw new COSC1436EarlyMorningException();      
    }
    String input2 = JOptionPane.showInputDialog("Enter a number between 0 and "+(n1-1));
    int n2 = Integer.parseInt(input2);
    if( n2 < 0 || n2 > n1){
      throw new COSC1436EarlyMorningException(n2+" is not between [0,"+(n1-1)+"]");
    }  
    array = new String[n1];
    String input3 = JOptionPane.showInputDialog("Enter element at position "+n2);
    array[n2] = input3;
    
//    
//    catch(NegativeArraySizeException e1){
//      System.out.println("Sorry sir/ma'am, negative values are not allowed: "+e1);
//    }
//    catch(NumberFormatException e2){
//      System.out.println("The number: "+e2.getMessage()+" is invalid");
//    }
//    catch(ArrayIndexOutOfBoundsException e3){
//      System.out.println("Number out of range: "+e3);
//    }
    
    
  }
  
}
