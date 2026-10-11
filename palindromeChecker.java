import java.util.Scanner;

public class palindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter word/phrase: ");
        String text = input.nextLine();
        String lower = text.toLowerCase();

        String clean = "";
        for(int i =0; i<lower.length(); i++) {
            char c = lower.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                clean += c;
            }
        }
        String reverse = "";
        for (int i = clean.length() - 1; i >= 0; i--) {
            reverse += clean.charAt(i);
        }

        if (clean.length() > 0 && clean.equals(reverse)) {
            System.out.println(text + " is a palindrome");
        } else {
            System.out.println(text + " is not a palindrome");
        }
    }
}
