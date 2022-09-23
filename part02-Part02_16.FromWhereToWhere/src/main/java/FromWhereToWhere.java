
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        
        System.out.println("Where to?");
        int to1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int from1 = Integer.valueOf(scanner.nextLine());
        
        for (int i = from1; i <= to1; i++) {
            System.out.println(i);
        }
        
    }
}
