import java.util.Scanner;

public class qn4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }

        System.out.println("Number of words: " + count);

        scanner.close();
    }
}