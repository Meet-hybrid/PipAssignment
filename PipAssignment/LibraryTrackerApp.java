import java.util.ArrayList;
import java.util.Scanner;

public class LibraryTrackerApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        ArrayList<String> books = new ArrayList<>();
        books.add("The Second chance");
        books.add("2025");
        books.add("Don't expect different result");
        books.add("The Great i'am");
        books.add("Prove you can do it");

ArrayList<Boolean> available = new ArrayList<>();
        for (int num = 0; num < books.size(); num++) {
            available.add(true);
        }

        while (true) {
            System.out.println("""
	    \nLibrary Tracker App
            1. View all books
            2. Borrow a book
            3. Return a book
            4. Exit
            """);
System.out.print("Enter your choice: ");
int choice = input.nextInt();

switch (choice) {
                case 1 -> {
                    System.out.println("\nBooks in the library:");
                    for (int num = 0; num < books.size(); num++) {
                        String status = available.get(num) ? "Available" : "Borrowed";
                        System.out.println((num + 1) + ". " + books.get(num) + " - " + status);
                    }
                }

       
  }
}
}
}     