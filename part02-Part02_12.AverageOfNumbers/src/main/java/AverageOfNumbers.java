
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);        
        int count = 0;
        int result = 0;
        
        while (true){
            System.out.println("Give a number: ");
            int number = scanner.nextInt();
           
            if (number != 0){
                count++;
                result += number;
            } else {
                break;
            }
        }
        
        float average;
        average = (float)result / count;
        System.out.println("Average of the numbers: " + average);
    }
}
