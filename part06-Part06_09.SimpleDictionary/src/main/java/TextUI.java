/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kindb
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class TextUI {
    
    
    private Scanner scanner = new Scanner(System.in);
    private SimpleDictionary dictionary;
    
    

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    
    
    
    public void start() {
        ArrayList<String> words = new ArrayList<>();
        
        while (true) {
            
            
            System.out.println("Command: ");
            String word = scanner.nextLine();
            

            if (word.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            
            

            if (word.equals("add")) {
                System.out.println("Word: ");
                String word1 = scanner.nextLine();
                System.out.println("Translation ");
                String word2 = scanner.nextLine();

                dictionary.add(word1, word2);
                words.add(word1);
                

                continue;
            }
            
            if (word.equals("search")) {
                System.out.println("To be translated: ");
                String word3 = scanner.nextLine();
                System.out.println("Translation: ");
                
                /*
                if (words.contains(word3)) {
                    System.out.println(dictionary.translate(word3));
                    continue;
                }*/
                
                if (dictionary.containsKey(word3)) {
                    System.out.println(dictionary.translate(word3));
                    continue;
                }
                
                
                
                
                
                System.out.println("Word " + word3 + " was not found");
                //System.out.println(dictionary.translate(word3));
                
                
                continue;
            }

            System.out.println("Unknown command");

        }
    }

}
