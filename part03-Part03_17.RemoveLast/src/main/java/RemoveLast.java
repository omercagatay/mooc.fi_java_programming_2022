
import java.util.ArrayList;

public class RemoveLast {
    public static void removeLast(ArrayList<String> strings){
        int index = strings.size() - 1;

        if (strings.size() == 0){
            return;
        }
        strings.remove(index);
    }

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.remove(cars.size()- 1);
        System.out.println(cars);
    }

}
