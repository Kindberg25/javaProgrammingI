
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(3);
        list.add(1);
        list.add(7);
        list.add(9);
        list.add(2);
        list.add(6);
        
        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(list, 1, 2);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number : numbers) {
        if ( (number >= lowerLimit) && (number <= upperLimit) ) {
            System.out.println(number);
        }
    }
        
    }

}
