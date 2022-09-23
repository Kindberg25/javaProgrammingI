
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kindb
 */
public class UserInterface {

    private TodoList toDo;
    private Scanner scanner = new Scanner(System.in);
    
    
    public UserInterface(TodoList toDo, Scanner scanner) {
        this.toDo = toDo;
        this.scanner = scanner;
    }
    
    
    public void start() {
        
        
        while (true) {  
            System.out.println("Command: ");
            String word1 = scanner.nextLine();
            
            if (word1.equals("add")) {
                System.out.println("To add: ");
                String word2 = scanner.nextLine();
                
                toDo.add(word2);
                continue;
                
            }
            
            
            if (word1.equals("list")) {
                toDo.print();
                continue;
                       
                
            }
            
            if (word1.equals("stop")) {
                break;
                
            }
            
            if (word1.equals("remove")) {
                System.out.println("Which one is removed?");
                int removeIdx = Integer.valueOf(scanner.nextLine());
                
                toDo.remove(removeIdx);
            }
            
            
            
            
        }
        
    }
    

}
