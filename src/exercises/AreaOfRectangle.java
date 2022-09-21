package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length? ");
        Float length = input.nextFloat();
        System.out.println(length + " inches");
        System.out.println("What is the Width? ");
        Float width = input.nextFloat();
        System.out.println( width + " Inches-Squared");
        Float area = length * width;
        System.out.println(area);


    }
}
