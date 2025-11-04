import java.util.Scanner;

public class IBANFormatter implements Utility {
    
    @Override
    public String getName() {
        return "IBAN Formatter";
    }
    
    @Override
    public String getDescription() {
        return "Formats an IBAN to uppercase with spaces for better readability";
    }
    
    @Override
    public void run(Scanner scanner) {
        System.out.println("\n=== IBAN Formatter ===");
        System.out.print("Enter IBAN: ");
        String iban = scanner.nextLine();
        
        String formatted = formatIBAN(iban);
        System.out.println("\nFormatted IBAN: " + formatted);
        System.out.println();
    }
    
    /**
     * Formats an IBAN string to uppercase and adds spaces every 4 characters
     * @param iban The input IBAN string
     * @return The formatted IBAN with spaces
     */
    public String formatIBAN(String iban) {
        // Remove all whitespace and convert to uppercase
        String cleaned = iban.replaceAll("\\s+", "").toUpperCase();
        
        // Add spaces every 4 characters
        StringBuilder formatted = new StringBuilder();
        for (int i = 0; i < cleaned.length(); i++) {
            if (i > 0 && i % 4 == 0) {
                formatted.append(" ");
            }
            formatted.append(cleaned.charAt(i));
        }
        
        return formatted.toString();
    }
}
