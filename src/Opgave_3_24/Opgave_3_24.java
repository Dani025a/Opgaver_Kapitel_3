package Opgave_3_24;

public class Opgave_3_24 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {


            double ran = (double) (Math.random() * 52.0) + 1;
            int random = (int) ran;

            if (random >= 1 && random <= 13) {
                if (random == 1)
                    System.out.println("Your card is Ace of Clubs");
                else if (random == 11)
                    System.out.println("your card is Jack of Clubs");
                else if (random == 12)
                    System.out.println("your card is Queen of Clubs");
                else if (random == 13)
                    System.out.println("Your card is King of Clubs");
                else
                    System.out.println("Your card is " + random + " of Clubs");
            }
            if (random >= 14 && random <= 26) {
                if (random == 14)
                    System.out.println("Your card is Ace of Diamonds");
                else if (random == 24)
                    System.out.println("your card is Jack of Diamonds");
                else if (random == 25)
                    System.out.println("your card is Queen of Diamonds");
                else if (random == 26)
                    System.out.println("Your card is King of Diamonds");
                else
                    System.out.println("Your card is " + (random - 13) + " of Diamonds");
            }
            if (random >= 27 && random <= 39) {
                if (random == 27)
                    System.out.println("Your card is Ace of Hearts");
                else if (random == 37)
                    System.out.println("your card is Jack of Hearts");
                else if (random == 38)
                    System.out.println("your card is Queen of Hearts");
                else if (random == 39)
                    System.out.println("Your card is King of Hearts");
                else
                    System.out.println("Your card is " + (random - 26) + " of Hearts");
            }
            if (random >= 40 && random <= 52) {
                if (random == 40)
                    System.out.println("Your card is Ace of Spades");
                else if (random == 49)
                    System.out.println("your card is Jack of Spades");
                else if (random == 51)
                    System.out.println("your card is Queen of Spades");
                else if (random == 52)
                    System.out.println("Your card is King of Spades");
                else
                    System.out.println("Your card is " + (random - 39) + " Of Spades");
            }
        }
    }
}
