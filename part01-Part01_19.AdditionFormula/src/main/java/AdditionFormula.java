
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give the first number:");
        Integer firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        Integer secondNumber = Integer.valueOf(scanner.nextLine());
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));

    }
}
