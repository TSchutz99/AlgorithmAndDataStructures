package Lab4.Q2;

public class Card {
    private int face;  // 1 to 13 representing Ace to King
    private String suit; //"Hearts", "Diamonds", "Clubs", or "Spades"

    public Card(int face, String suit) {
        setFace(face);
        setSuit(suit);
    }

    public void setFace(int face) {
        this.face = face;
    }
    public int getFace(){
        return face;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
    public String getSuit() {
        return suit;
    }

    public String toString(){
        String output = "";
        if(getFace() == 13)
            output += "King";
        else if(getFace() == 12)
            output += "Queen";
        else if(getFace() == 11)
            output += "Jack";
        else if(getFace() == 1)
            output += "Ace";
        else
            output += getFace();

    output += " of " + getSuit();

    return output;
    }

}
