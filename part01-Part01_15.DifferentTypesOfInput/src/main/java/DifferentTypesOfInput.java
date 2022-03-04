import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String sth = scan.nextLine();
        System.out.println("Give an integer:");
        Integer number = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        Double dnumber = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        Boolean bool = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + sth);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + dnumber);
        System.out.println("You gave the boolean " + bool);

    

    }
}
