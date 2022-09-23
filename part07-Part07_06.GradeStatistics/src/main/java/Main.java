
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        GradeRegister register = new GradeRegister();

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            if (input < 0 || input > 100) {
                continue;
            }
            register.add(input);
            register.addGradeBasedOnPoints(input);
        }
        
        System.out.println();

        register.averagePoints();
        register.averagePassing();
        
        
    }
}
