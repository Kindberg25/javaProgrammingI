
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> identifierList = new ArrayList<>();
        // ArrayList<String> namesList = new ArrayList<>();
         

        //ArrayList<String> identifierList = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();

            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String names = scanner.nextLine();

            if (names.isEmpty()) {
                break;
            }

        
           
            
            

            identifierList.add(identifier + ": " + names);
        }

        System.out.println("==items==");
        /*
        for (int i = 0; i < namesList.size(); i++) {
            System.out.println(identifierList.get(i) + ": " + namesList.get(i));
        }
        */
        
        
        for (String index : identifierList) {
            System.out.println(index);
        }
    }
}
