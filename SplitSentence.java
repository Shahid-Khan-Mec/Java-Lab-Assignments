import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // Split the sentence into words using space as delimiter
        String[] words = sentence.split(" ");
        
        System.out.println("\nWords in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
        
        scanner.close();
    }
}