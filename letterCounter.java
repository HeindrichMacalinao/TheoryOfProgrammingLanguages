import java.util.Scanner;

public class letterCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = input.nextLine();
        sentence = sentence.toLowerCase();

        System.out.print("Enter letter: ");
        String letterInput = input.nextLine();
        letterInput = letterInput.toLowerCase();
        
        char target = letterInput.charAt(0);

        int count = 0;
        for(int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("The letter " + letterInput + " appeared " + count +" times/s");
    }
}
