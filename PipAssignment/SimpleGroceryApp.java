import java.util.ArrayList;
import java.util.Scanner;

public class SimpleGroceryApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> groceryList = new ArrayList<>();

	while (true) {
		System.out.println("""
	        |=======================================|
                |Welcome to Hybrid Simple Grocery App   |
                |1. Add Item                            |
                |2. Remove Item                         |
                |3. Show All Items                      |
                |4. Exit                                |
	        =========================================
                """);

            System.out.print("Enter your choice (1-4): ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item to add: ");
                    String item = input.nextLine();
                    if (!item.isEmpty()) {
                        groceryList.add(item);
                        System.out.println(item + " added successfully!");
                    } else {
                        System.out.println("Cannot add empty item!");
                    }
                    break;

                case 2:
                    if (groceryList.isEmpty()) {
                        System.out.println("No items to remove.");
                    } else {
                        System.out.println("Your Grocery List:");
                        for (int num = 0; num < groceryList.size(); num++) {
                            System.out.println((num + 1) + ". " + groceryList.get(i));
                        }
                        System.out.print("Enter the number of the item to remove: ");
                        int index = input.nextInt();
                        input.nextLine();
                        if (index >= 1 && index <= groceryList.size()) {
                            String removed = groceryList.remove(index - 1);
                            System.out.println(removed + " removed successfully!");
                        } else {
                            System.out.println("Invalid number!");
                        }
                    }
                    break;

                case 3:
                    if (groceryList.isEmpty()) {
                        System.out.println("No items yet.");
                    } else {
                        System.out.println("Your Grocery List:");
                        for (int num = 0; num < groceryList.size(); num++) {
                            System.out.println((num + 1) + ". " + groceryList.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}