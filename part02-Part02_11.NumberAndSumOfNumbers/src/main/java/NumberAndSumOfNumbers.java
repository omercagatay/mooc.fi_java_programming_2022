
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sumOfNumbers = 0;
        
        while (true){
            System.out.println("Give a number: ");
            int number = scanner.nextInt();
            
            if (number != 0){
                count++;
                sumOfNumbers += number;
            } else {
                break;
            }
        }
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sumOfNumbers);
    }
}
