package Opgave_3_14;

import java.util.Scanner;

public class Opgave_3_14 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to coinflip pick head or tail:\n1. head \n2. tail \nIf you wish to end game write a random number");
            String spiller = input.nextLine();

            double ran = (double) (Math.random() * 2.0) + 1;
            int random = (int)ran;

            if (spiller.equals("head") || spiller.equals("1") && random == 1)
                System.out.println("Congrats it was heads!");
            else if (spiller.equals("head") || spiller.equals("1") && random == 2)
                System.out.println("You lost :( ");
            else if (spiller.equals("tail") || spiller.equals("2") && random == 2)
                System.out.println("You lost :( ");
            else if(spiller.equals("tail") || spiller.equals("2") && random == 1)
                System.out.println("Congrats it was tail!");
            else
                break;
        }
    }
}
