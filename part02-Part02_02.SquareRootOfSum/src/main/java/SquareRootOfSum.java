
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer firstNnumber = Integer.valueOf(scanner.nextLine());
        Integer secondNumber = Integer.valueOf(scanner.nextLine());
        Integer totalNumber = (firstNnumber + secondNumber);
        Double squareRoot = Math.sqrt(totalNumber);
        System.out.println(squareRoot);
    }
}
