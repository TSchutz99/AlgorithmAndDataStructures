package Lab1;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text;

        System.out.print("Enter some text: ");
        text = input.nextLine();

        System.out.println("Number of words in text is " + countWords(text));
    }

    public static int countWords(String text){
        int words = 0;

        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == ' ')
                words++;
        }

        return words+1;
    }
}
