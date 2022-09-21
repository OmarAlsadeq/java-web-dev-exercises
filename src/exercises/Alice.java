package exercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String paragraph = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do:" +
                " once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it," +
                " 'and what is the use of a book,' thought Alice 'without pictures or conversation?";
        System.out.println("Search for a term within the String: ");
        String term = input.nextLine();
        if (term.contains(paragraph)){
            System.out.println("In the string");
        } else {
            System.out.println("Not in the string");
        }

    }
}
