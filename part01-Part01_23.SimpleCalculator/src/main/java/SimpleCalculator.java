
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        Integer firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        Integer secondNumber = Integer.valueOf(scanner.nextLine());
        
        String plus = String.valueOf(firstNumber) + " + " + String.valueOf(secondNumber ) + " = ";
        String minus = String.valueOf(firstNumber) + " - " + String.valueOf(secondNumber) + " = ";
        String multiply = String.valueOf(firstNumber) + " * " + String.valueOf(secondNumber) + " = ";
        String divide = String.valueOf(firstNumber) + " / " + String.valueOf(secondNumber) + " = ";        
        
        System.out.println(plus + (firstNumber + secondNumber));
        System.out.println(minus + (firstNumber - secondNumber));
        System.out.println(multiply + (firstNumber * secondNumber));
        System.out.println(divide + (1.0 * firstNumber / secondNumber));
        
    }
}
