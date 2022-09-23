
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sum = 0;
        int num = 0;
        
        while (true) {
            
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                sum = sum + number;
                num = num + 1;
            }
            
            
            
        }
        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        } else  {
            System.out.println(sum / num);
        }
        
    }
}
