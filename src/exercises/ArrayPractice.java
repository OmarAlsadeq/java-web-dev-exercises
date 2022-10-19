package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> someIntegers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,33,42,101,1138));
        String phrase = "I would not, could not, in a box." +
                " I would not, could not with a fox." +
                " I will not eat them in a house." +
                " I will not eat them with a mouse.";
        ArrayList<String> words = new ArrayList<>(Arrays.asList(phrase.split(" ")));

        System.out.println(sumEven(someIntegers));

        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        printWord(words, numChars);
    }


        public static int sumEven(ArrayList<Integer> arr) {
            int total = 0;
            for (int integer : arr) {
                if (integer % 2 == 0) {
                    total += integer;
                }
            }
            return total;
        }
        static void printWord(ArrayList<String> str, int length) {
            for (String word : str) {
                if (word.length() == length) {
                    System.out.println(word);
                }

            }
        }
    }

