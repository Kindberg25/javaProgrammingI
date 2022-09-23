
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int integ = Integer.valueOf(scanner.nextLine());
        
        if (integ < 0 ) {
            System.out.println(integ * (-1));
        }   else    {
            System.out.println(integ);
        }

    }
}
