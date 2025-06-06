import java.util.Scanner;

public class PalindromeChecke {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            
            if (isPalindrome(input)) {
                System.out.println("'" + input + "' is a palindrome.");
            } else {
                System.out.println("'" + input + "' is not a palindrome.");
            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}