package exercises;

import java.util.Scanner;

public class Miles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles driven: ");
        Double miles = input.nextDouble();

        System.out.println("Enter gallons used: ");
        Double gallons = input.nextDouble();

        Double mPG = miles / gallons;
        System.out.println(mPG + " MPG");
    }
}
