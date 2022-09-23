
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 = 0;
        int container2 = 0;
        int max = 100;

        while (true) {

            System.out.println("First: " + container1 + "/" + max);
            System.out.println("Second: " + container2 + "/" + max);

            String input = scan.nextLine();

            if (input.equals("quit")) {
                //System.out.println("First: " + container1 + "/100");
                //System.out.println("Second: " + container2 + "/100");
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            // ADDING !
            if (command.equals("add") && amount >= 0) {
                if (container1 + amount >= max) {
                    container1 = max;
                    continue;
                }
                container1 = container1 + amount;
            }

            // MOVING !!
            if (command.equals("move") && amount >= 0) {

                // Case 1
                if ((container1 - amount) >= 0 && (container2 + amount) <= max) {
                    container1 -= amount;
                    container2 += amount;
                    continue;
                }

                // Case 2 
                if ((container1 - amount) < 0 && (container2 + amount) <= max) {

                    container2 += container1;
                    container1 = 0;
                    continue;
                }

                // Case 3
                if ((container1 - amount) < 0 && (container2 + amount) > max) {
                    container1 = 0;
                    container2 = max;
                    continue;
                }

                // Case 4
                if ((container1 - amount) >= 0 && (container2 + amount) > max) {
                    container1 -= amount;
                    container2 = max;
                    continue;
                }

            }

            // REMOVE !!
            if ((command.equals("remove")) && (amount >= 0)) {
                
               if ((container2 - amount) <= 0) {
                    container2 = 0;
                    continue;
                }
                
                if ((container2 - amount) > 0) {
                    container2 -= amount;
                    continue;
                }

            }

            System.out.println("");

        }
    }

}
