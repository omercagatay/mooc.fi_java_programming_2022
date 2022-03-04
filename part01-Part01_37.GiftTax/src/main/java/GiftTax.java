
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        Integer giftAmount = Integer.valueOf(scan.nextLine());

        Integer baseTax = 100;
        Double taxRate = 0.08;
        Integer baseAmount = 5000;

        Integer baseTax2 = 1700;
        Double taxRate2 = 0.1;
        Integer baseAmount2 = 25000;

        Integer baseTax3 = 4700;
        Double taxRate3 = 0.12;
        Integer baseAmount3 = 55000;

        Integer baseTax4 = 22100;
        Double taxRate4 = 0.15;
        Integer baseAmount4 = 200000;

        Integer baseTax5 = 142100;
        Double taxRate5 = 0.17;
        Integer baseAmount5 = 1000000;

        if (giftAmount >= 5000 && giftAmount <= 25000){
            Double calculation = (baseTax + ((giftAmount - baseAmount) * taxRate));
            System.out.println("Tax: " + calculation);
        } else if (giftAmount > 25000 && giftAmount <= 55000){
            Double calculation = (baseTax2 + ((giftAmount - baseAmount2) * taxRate2));
            System.out.println("Tax: " + calculation);
        } else if (giftAmount > 55000 && giftAmount <= 200000){
            Double calculation = (baseTax3 + ((giftAmount - baseAmount3) * taxRate3));
            System.out.println("Tax: " + calculation);
        } else if (giftAmount > 200000 && giftAmount <= 1000000){
            Double calculation = (baseTax4 + ((giftAmount - baseAmount4) * taxRate4));
            System.out.println("Tax: " + calculation);
        } else if (giftAmount > 1000000) {
            Double calculation = (baseTax5 + ((giftAmount - baseAmount5) * taxRate5));
            System.out.println("Tax: " + calculation);
        } else {
            System.out.println("No tax!");
        }

    }
}

