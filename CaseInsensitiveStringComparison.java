import java.util.Scanner;

public class CaseInsensitiveStringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get first string input
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        
        // Get second string input
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
        // Compare strings ignoring case
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("The strings are EQUAL (ignoring case)");
        } else {
            System.out.println("The strings are NOT equal (even ignoring case)");
        }
        
        scanner.close();
    }
}