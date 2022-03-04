
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            
            if (number > 0) {
                int result = number * number;
                System.out.println(result);    
            }
            if (number < 0) {
                System.out.println("Unsuitable number");
            }
            
            if (number == 0) {
                break;
            }
        }
    }
}
