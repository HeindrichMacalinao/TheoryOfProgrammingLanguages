import java.util.Scanner;

public class Lab1 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a word: ");
       String word = input.nextLine();
       System.out.print("Enter a letter: ");
       String letter = input.nextLine();
       word = word.toLowerCase();
       String regex = "";
       String[] Array = word.split(regex);
       int i = 0;
       for (String s : Array) {
           if (s.contains(letter)) {
               i = i + 1;
           }
       }
       System.out.println("The letter " + letter + " appeared " + i + " times/s");
   }
}
