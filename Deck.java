import java.util.*;
class Deck {
    ArrayList<Card> deck;

    // Constructor initializes the deck and creates all 52 cards
    public Deck() {
        deck = new ArrayList<>();
        createDeck();
    }

    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};

        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

     // Prints a specific card from the deck based on its index
     public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            System.out.println(deck.get(index));
        } else {
            System.out.println("Invalid card index!");
        }
    }


     // Prints all cards of the specified suit
     public void sameCard(String suit) {
        for (Card card : deck) {
            if (card.suit.equalsIgnoreCase(suit)) {
                System.out.println(card);
            }
        }
    }

    
}
