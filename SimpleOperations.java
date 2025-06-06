import java.util.Arrays;
import java.util.Scanner;

public class SimpleOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 3 array elements (space separated): ");
        String[] arr = sc.nextLine().split(" ");
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        System.out.println("\nArray operations:");
        System.out.println("Original: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));
        
        System.out.println("\nString operations:");
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Contains 'a': " + str.contains("a"));
    }
}