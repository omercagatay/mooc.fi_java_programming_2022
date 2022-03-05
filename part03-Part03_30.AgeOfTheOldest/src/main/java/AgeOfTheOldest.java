
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggestAge = 0;

        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String[] splitInput = input.split(",");
            for(int i = 0; i < splitInput.length; i++){
                if (Integer.valueOf(splitInput[1]) > biggestAge){
                    biggestAge = Integer.valueOf(splitInput[1]);
                }
            }
            System.out.println(biggestAge);
        }


    }
}
