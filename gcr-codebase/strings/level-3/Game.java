import java.util.Scanner;

public class Game {
    // Method to initialize the deck of cards
    private static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    private static String[] shuffleDeck(String[] deck) {
        int n = deck.length;

    
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));

            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Method to distribute n cards to x players
    private static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {

        // Check if cards can be distributed
        if (players * cardsPerPlayer > deck.length) {
            return null;
        }

        String[][] result = new String[players][cardsPerPlayer];
        int index = 0;

        // Distribute cards to players
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                result[i][j] = deck[index++];
            }
        }
        return result;
    }

    // Method to print players and their cards
    private static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Suits and ranks
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        // Initialize deck
        String[] deck = initializeDeck(suits, ranks);

        // Shuffle deck
        deck = shuffleDeck(deck);

        Scanner sc = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        // Distribute cards
        String[][] distributedCards = distributeCards(deck, players, cardsPerPlayer);

        if (distributedCards == null) {
            System.out.println("Cards cannot be distributed with given inputs.");
        } else {
            printPlayers(distributedCards);
        }
    }
}