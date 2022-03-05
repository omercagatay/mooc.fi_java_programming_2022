
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> numbers = new ArrayList<>();
        

        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            }
            numbers.add(input);
        } 
        
        int index = 0;
        int total = 0;

        while (index < numbers.size()){
            total += numbers.get(index);
            index++;
        }

        double average = (total * 1.0) / index;
        System.out.println("Average: " + average);
    }
}
