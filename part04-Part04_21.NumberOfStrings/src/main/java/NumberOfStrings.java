
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (true) {
            String sentence = scanner.nextLine();

            if (sentence.equals("end")) {
                break;
            }

            count = count + 1;

        }
        System.out.println(count);

    }
}
