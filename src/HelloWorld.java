import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloWorld {
    private static List<Utility> utilities = new ArrayList<>();
    
    public static void main(String[] args) {
        // Register all available utilities
        utilities.add(new IBANFormatter());
        
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        System.out.println("=================================");
        System.out.println("   Welcome to Utility Toolbox");
        System.out.println("=================================\n");
        
        while (running) {
            displayMenu();
            System.out.print("Select an option: ");
            
            String input = scanner.nextLine();
            
            try {
                int choice = Integer.parseInt(input);
                
                if (choice == 0) {
                    running = false;
                    System.out.println("\nGoodbye!");
                } else if (choice > 0 && choice <= utilities.size()) {
                    Utility selectedUtility = utilities.get(choice - 1);
                    selectedUtility.run(scanner);
                } else {
                    System.out.println("\nInvalid option. Please try again.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nPlease enter a valid number.\n");
            }
        }
        
        scanner.close();
    }
    
    private static void displayMenu() {
        System.out.println("Available Utilities:");
        System.out.println("--------------------");
        
        for (int i = 0; i < utilities.size(); i++) {
            Utility utility = utilities.get(i);
            System.out.printf("%d. %s - %s%n", 
                i + 1, 
                utility.getName(), 
                utility.getDescription());
        }
        
        System.out.println("0. Exit");
        System.out.println();
    }
}
