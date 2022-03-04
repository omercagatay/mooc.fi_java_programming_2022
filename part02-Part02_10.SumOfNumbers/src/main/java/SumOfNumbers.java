
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int result = 0;
        
        while (true){
            System.out.println("Give a number:");
            int number = scanner.nextInt();

            if (number != 0){
                result += number;
            } else {
                break;
            }
        }
        System.out.println("Sum of the numbers: " + result);
    }
}
