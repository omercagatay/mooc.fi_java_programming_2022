
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> number = new ArrayList<>();
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999){
                break;
            }            
            number.add(input);
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallestNumber = number.get(0);
        int counter = 0;
        int index = 0;
        
        while (counter < number.size()){
            if (number.get(counter) < smallestNumber){
                smallestNumber = number.get(counter);
                index = counter;
            }
            counter++;
        }
        
        System.out.println("Smallest number: " + smallestNumber);
        System.out.println("Found at index: " + index);
        
        
    }
}
