import javax.swing.*;
// chapter 12
public class ExceptionExample{
  public static void main(String [] args){
    String[] array = null;
    try{
      String input1 = JOptionPane.showInputDialog("Enter a number for the array");
      int n1 = Integer.parseInt(input1);
      String input2 = JOptionPane.showInputDialog("Enter a number between 0 and "+(n1-1));
      int n2 = Integer.parseInt(input2);
      array = new String[n1];
      String input3 = JOptionPane.showInputDialog("Enter element at position "+n2);
      array[n2] = input3;
    }
    catch(NegativeArraySizeException e1){
      System.out.println("Sorry sir/ma'am, negative values are not allowed: "+e1);
    }
    catch(NumberFormatException e2){
      System.out.println("The number: "+e2.getMessage()+" is invalid");
    }
    catch(ArrayIndexOutOfBoundsException e3){
      System.out.println("Number out of range: "+e3);
    }
    finally{
      System.out.println("The current array looks: ");
      for(String s : array){
        System.out.println(s);
      }
    }

  }
  
}
