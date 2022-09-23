
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year: ");
            int publYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, publYear));

        }

        System.out.println("What information will be printed? ");
        String whatInfo = scanner.nextLine();

        for (Book bk : books) {
            if (whatInfo.equals("everything")) {
                System.out.println(bk.getName() + ", " + bk.getPages() + " pages, " + bk.getPublYear());
            }
            
            if (whatInfo.equals("name")) {
                System.out.println(bk.getName());
            }
        }

        // implement here the program that allows the user to enter 
        // book information and to examine them
    }
}
