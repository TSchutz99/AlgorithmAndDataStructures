package Lab4.Q2;

import javax.swing.*;

public class Deck {
    private Card[] cards;

    public Deck(Card[] cards){
        setCards(cards);
    }

    public String toString(){
        String output = "";
        for(int i = 0; i < cards.length; i++){
            if(i % 13 == 0)
                output += "\n";

            if(i == cards.length -1)
                output += cards[i] + ".";
            else
                output += cards[i] + ", ";
        }

        return output;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }
    public Card[] getCards(){
        return cards;
    }

    public void shuffle(){
        Card[] shuffleDeck = new Card[cards.length];
        boolean[] alreadypicked = new boolean[cards.length];

        for(int i = 0; i < cards.length; i++){
            int randomnumber = (int)(Math.random() * cards.length);

            while(alreadypicked[randomnumber] == true){
                randomnumber = (int)(Math.random() * cards.length);
            }

            shuffleDeck[i] = cards[randomnumber];
            alreadypicked[randomnumber] = true;
        }

        cards = shuffleDeck;
    }
}
