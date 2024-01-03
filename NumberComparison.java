import java.util.Scanner;
 
public class NumberComparison {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int firstNumber, secondNumber;
        
        System.out.println("Enter the first number: ");
        firstNumber = scanner.nextInt();
        
        System.out.println("Enter the second number: ");
        secondNumber = scanner.nextInt();
        
        if(firstNumber > secondNumber){
        
            System.out.println(firstNumber + " is greater than " + secondNumber);
        
        }  
        
        else if (firstNumber == secondNumber) {
            
            System.out.println("The first number " + firstNumber + " and the second number "+ secondNumber + " are equal");
        }
        
        else {
        
            System.out.println(secondNumber + " is greater than " + firstNumber);
        
        }
       
    }
}