
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        int total = 0;
        int count = 0;
        int oddCount = 0;
        int evenCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        
        
        while (true) {
            int input = scanner.nextInt();
            if (input == -1){
                break;
            }
            
            if (input != -1){
                count++;
                total += input;
            }
            
            if (input % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
            
        }
        double average = (total * 1.0) / count;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + total);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
    }
}
