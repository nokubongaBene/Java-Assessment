package assignment.pkg3;
/**
 *
 * @author Benedicta
 */
import java.util.Scanner;

public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static int FavNumbers(int number1, int number2){
        int minValue;
      
        if(number1 < number2)
           return minValue = number1;
        else
           return minValue = number2; 
        
    }
    public static int getMaxValue(int number1, int number2){
        int maxValue;
        
        if(number1 > number2)
            return maxValue = number1;
        else
            return maxValue = number2;
    }
    public static void CompareStrings(){
        String name, firstname;
        firstname = "Nokubonga";
        
        Scanner names = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        name = names.next();
        
        if(name.equals(firstname)) 
            System.out.println("You are a good person.");
        else
            System.out.println("invalid name.");  
    }
    public static void main(String[] args) {
       
       //Calling the package
       Scanner inputData = new Scanner(System.in);
       
       //testing ternary
       boolean a = true;
       boolean b = false;
       boolean results =(a != b) ? true:false;
       System.out.println("The result is: "+results);
       
       
       //variables to be used
       int num1, num2, minValue, maxValue;
       String name;
       
        //getting input from the user
       System.out.println("Please enter a number of your choice: ");
       num1 = inputData.nextInt();
       System.out.println("Please enter a second number of your choice: ");
       num2 = inputData.nextInt();
       
       //calling the FavNumbers and GetMaxValue methods
       minValue = FavNumbers(num1,num2);
       maxValue = getMaxValue(num1, num2);
       System.out.println("The minimum value of your two numbers is: "+ minValue);
       System.out.println("The maximum value of your two number is: "+maxValue);
       
       //calling the comparison methods
       CompareStrings();
       
       System.out.println("Please choose an operand: ++, --,");
       String operand = inputData.next();
       
       //using the switch statement
       switch(operand){
           case "++":
               ++num1;
               System.out.println("The pre-adding of num1 is:"+ num1);
               num1++;
               System.out.println("The post-adding of num1 is: "+ num1);
               
               //using operators to override operator precedence
               num2 = (num1 - num1) + num2 + num2 * (6/2);
               System.out.println("The new value for num2 is: "+ num2);
               break;
           case "--":
               --num2;
               System.out.println("The pre-subtracting of num2 is:"+ num2);
               num2--;
               System.out.println("The post-subtracting of num2 is: "+ num2);
               
               //using operators to override operator precedence
               num1 = (num1 * num1) + (num2 * num2) + (12 % 5);
               System.out.println("The new value for num2 is: "+ num1);
               break;
           default:
               System.out.println("You have entered an invalid operand!");
       }
       
    }
    
}
