
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positiveCount = 0;
        int result = 0;
        float average;
        
        while (true){
            int number = scanner.nextInt();
            
            if (number > 0){
                positiveCount++;
                result += number;
            }
            
            if (positiveCount == 0){
                System.out.println("Cannot calculate the average");
            }
            
            if (number == 0){
                break;
            }
        }
        average = (float)result / positiveCount;
        System.out.println(average);
    }
}
