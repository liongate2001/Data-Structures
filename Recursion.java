import java.util.Scanner;
 
public class Recursion {
    
  public static void displayNumbers(int num) {
      
        if (num >= 1) {
            
            displayNumbers(num - 1);
            System.out.println(num);
        }
  }
  
  public static void main (String[] args) {
      
    Scanner scanner = new Scanner(System.in);
        try {
            
            System.out.print("Enter the maximum number: ");
            
            int maxNum = scanner.nextInt();
            
            if (maxNum < 1) {
                
                System.out.println("Please enter a positive integer.");
            } else {
                displayNumbers(maxNum);
            }
            
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
  }
}