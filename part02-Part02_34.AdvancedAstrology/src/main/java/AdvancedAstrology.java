
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int counter = 1;
        while (counter <= size) {
            printSpaces(size - counter);
            printStars(counter);
            counter++;
        }
    }

    public static void christmasTree(int height) {
        int counter = 1;
        int bottomCounter = 0;
        while (counter <= height){
            printSpaces(height- counter);
            printStars((counter * 2) - 1);
            counter++;
        }
        int spaceCount = ((((height) * 2 - 1) - 3) / 2);
        while (bottomCounter < 2){
            printSpaces(spaceCount);
            printStars(3);
            bottomCounter++;
        }
        // part 3 of the exercise
       
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
