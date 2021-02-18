package Lab4.Q2;

public class TestDeck {
    public static void main(String[] args) {
        Card[] cards = new Card[52];
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};

        for(int i = 0, c = 0; i < 4; i++){
            for(int f = 0; f < 13; f++) {
                Card card = new Card(f+1, suits[i]);

                cards[c] = card;
                c++;
            }
        }

        Deck myDeck = new Deck(cards);
        System.out.println(myDeck.toString());

        myDeck.shuffle();

        System.out.println(myDeck.toString());
    }
}
