
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggestAge = 0;
        String nameOfOldest = "";

        while(true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String[] splitInput = input.split(",");
            for(int i = 0; i < splitInput.length; i++){
                if (Integer.valueOf(splitInput[1]) > biggestAge){
                    biggestAge = Integer.valueOf(splitInput[1]);
                    nameOfOldest = splitInput[i];
                }
            }
            System.out.println(splitInput.length);
            System.out.println("Name of the oldest: " + nameOfOldest);
        }


    }
}
