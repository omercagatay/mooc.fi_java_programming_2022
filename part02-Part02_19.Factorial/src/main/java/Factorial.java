
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Give a number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= num; i++){
            result *= i;
        }
        System.out.println("Factorial: " + result);
    }
}
