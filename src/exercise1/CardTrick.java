package exercise1;
import java.util.Random;
import java.util.Scanner;  

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Moises Vera 2023-05-26 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
         
	Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(12-0+1)+0);
            card.setSuit(random.nextInt(3 - 0 + 1) + 0);
        }
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter card value: values 1 to 10, 11 for jack, 12 for queen, etc. ");
        int value = scanner.nextInt();
        System.out.println("Enter card suit:   1 for Hearts, 2 for Diamonds, etc.");
        int suit = scanner.nextInt();
         
        for (int i = 0; i < hand.length; i++) {
            if(value-1 == hand[i].getValue() && suit-1 == hand[i].getSuit()){
                System.out.print("Your card match");
            }
        }    
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Moises Vera 2023-05-06
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
