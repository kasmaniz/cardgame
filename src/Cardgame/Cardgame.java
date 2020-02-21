/*
 * Zohaib Kasmani
 * 991545984
 * Software design
 */
package Cardgame;

public class Cardgame {

    //enumerators user defined data type and constants
    
    public enum Suit{HEARTS,DIAMONDS,CLUBS,SPADES};
    private Suit suit;
    public enum Value{ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING,JOKER};
    private Value value;

    
    public Cardgame(Suit temp1,Value temp2){
        this.suit=temp1;
        this.value=temp2;
    }//if we use constructor then no need of settors in this class
    
    
    
    /**
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Value value) {
        this.value = value;
    }
    
}
