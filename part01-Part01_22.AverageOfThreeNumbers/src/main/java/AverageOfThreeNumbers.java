
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        Integer firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        Integer secondNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        Integer thirdNumber = Integer.valueOf(scanner.nextLine());
        double result = ((firstNumber + secondNumber + thirdNumber) / 3.0);
        System.out.println("The average is " + result);
    }
}
