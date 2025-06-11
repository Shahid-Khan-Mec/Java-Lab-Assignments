import java.util.Scanner;

public class StartEndCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.print("Enter start word to check: ");
        String startWord = scanner.nextLine();
        
        System.out.print("Enter end word to check: ");
        String endWord = scanner.nextLine();
        
        boolean startsWith = input.startsWith(startWord);
        boolean endsWith = input.endsWith(endWord);
        
        System.out.println("\nResults:");
        System.out.println("Starts with '" + startWord + "': " + startsWith);
        System.out.println("Ends with '" + endWord + "': " + endsWith);
        
        if (startsWith && endsWith) {
            System.out.println("The string both starts AND ends with the specified words!");
        } else if (startsWith) {
            System.out.println("The string only starts with the specified word.");
        } else if (endsWith) {
            System.out.println("The string only ends with the specified word.");
        } else {
            System.out.println("The string neither starts nor ends with the specified words.");
        }
        
        scanner.close();
    }
}