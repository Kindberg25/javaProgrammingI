
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("How old are you?");
        int integer = Integer.valueOf(scan.nextLine());
        
        if (integer >= 18) {
            System.out.println("You are an adult"); 
        }   else    {
            System.out.println("You are not an adult");
        }
    }
}