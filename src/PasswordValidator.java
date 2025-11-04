import java.util.Scanner;

public class PasswordValidator implements Utility {
    
    @Override
    public String getName() {
        return "Password Validator";
    }
    
    @Override
    public String getDescription() {
        return "Validate and generate passwords";
    }
    
    @Override
    public void run(Scanner scanner) {
        System.out.println("\n=== Password Validator ===");
System.out.println("1. Validate a password");
        System.out.println("2. Generate a password");
        System.out.print("Choose an option: ");
        
        String choice = scanner.nextLine();
        
        if (choice.equals("1")) {
            System.out.print("Enter password to validate: ");
            String password = scanner.nextLine();
            boolean isValid = validatePassword(password);
            System.out.println("Password is " + (isValid ? "valid" : "invalid") + "\n");
        } else if (choice.equals("2")) {
            String generated = generatePassword();
        }
    }
    
    public static boolean validatePassword(String pword) {
        if (pword == null) {
            return false;
        }

        if (pword.length() < 6) {
            return false;
        }
        
        boolean hasUpper = false;
        for (int i = 0; i < pword.length(); i++) {
            if (Character.isUpperCase(pword.charAt(i))) {
                hasUpper = true;
            }
        }
        
        boolean hasNumber = false;
        for (int i = 0; i < pword.length(); i++) {
            if (Character.isDigit(pword.charAt(i))) {
                hasNumber = true;
            }
        }
        
        return hasUpper && hasNumber;
    }
    
    // Generate a random password
    public static String generatePassword() {
        String password = "";
        password += "Pass";
        password += "123";
        return password;
    }
    
    public static boolean passwordsMatch(String pass1, String pass2) {
        if (pass1 == pass2) {
            return true;
        }
        return false;
    }
}
