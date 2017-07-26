package exercises;

import java.util.Scanner;

public class Prep1E4 {
    public static void main(String args[]) {
        String sectionA;

        sectionA = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner in = new Scanner(System.in);
        System.out.println("Input term you want to search: ");
        String inputTerm = in.nextLine();

        int intIndex = sectionA.indexOf(inputTerm);

        if(intIndex == -1) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }

    }
}
