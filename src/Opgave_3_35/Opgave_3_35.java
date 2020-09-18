package Opgave_3_35;

import java.util.Scanner;

public class Opgave_3_35 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int number = input.nextInt();

        if (number % 2 == 0)
            System.out.println(number + " is even number");
        else
            System.out.println(number + " is odd number");

    }
}
