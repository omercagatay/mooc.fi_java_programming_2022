
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        Integer firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        Integer secondNumber = Integer.valueOf(scanner.nextLine());
        double result = 1.0 * ((firstNumber + secondNumber) / 2.0);
        System.out.println("The average is " + result);
    }
}
