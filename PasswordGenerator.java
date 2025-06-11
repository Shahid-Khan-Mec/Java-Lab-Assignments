import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();
        
        System.out.print("Enter your registration number: ");
        String regNo = scanner.nextLine().trim();
        
        String password = generatePassword(name, regNo);
        System.out.println("Generated Password: " + password);
        
        scanner.close();
    }
    
    public static String generatePassword(String name, String regNo) {
        StringBuilder password = new StringBuilder();
        
        if (name.length() >= 3) {
            password.append(name.substring(0, 3).toLowerCase());
        } else {
            password.append(name.toLowerCase());
        }
        
        if (regNo.length() >= 3) {
            password.append(regNo.substring(regNo.length() - 3));
        } else {
            password.append(regNo);
        }
        
        password.append("@123");
        
        return password.toString();
    }
}