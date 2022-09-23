
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String sentence = String.valueOf(scanner.nextLine());
            String[] pieces = sentence.split(" ");

            for (int i = 0; i < pieces.length; i++) {
               
                if (sentence.contains("av")) {
                    System.out.println(pieces[i]);
                }
                
            }
            if (sentence.equals("")) {
                break;
            }
        }
        scanner.close();
    }
}
