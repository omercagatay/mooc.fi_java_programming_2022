
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        System.out.println("Search for?");
        int search = Integer.valueOf(scanner.nextLine());
        int counter = 0;
        
        while (counter < list.size()){
            if (search == list.get(counter)){
                System.out.println(search + " is at index " + counter);
            } else {
                System.out.println("");
            }
            counter++;
        }
    }
}
