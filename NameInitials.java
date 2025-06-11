import java.util.Scanner;

public class NameInitials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine().trim();
        
        String initials = getInitials(fullName);
        
        System.out.println("Short form: " + initials);
        
        scanner.close();
    }
    
    public static String getInitials(String name) {
        if (name.isEmpty()) {
            return "";
        }
        
        String[] words = name.split("\\s+");  // Split by one or more spaces
        StringBuilder initials = new StringBuilder();
        
        for (String word : words) {
            if (!word.isEmpty()) {  // Skip empty words (extra spaces)
                initials.append(word.charAt(0)).append(".");
            }
        }
        
        return initials.toString().toUpperCase();  // Return as "F.M.L."
    }
}