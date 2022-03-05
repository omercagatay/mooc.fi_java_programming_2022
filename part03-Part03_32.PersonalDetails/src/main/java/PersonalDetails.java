
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        double totalYear = 0;
        int counter = 0;

        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            counter++;
            String[] splitInput = input.split(",");

            if(splitInput[0].length() > longestName.length()){
                longestName = splitInput[0];
            }

            totalYear += Double.valueOf(splitInput[1]);

        }
        System.out.println(counter);
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + totalYear / counter);
    }
}
