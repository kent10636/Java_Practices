import java.util.List;
import java.util.Arrays;
import java.util.Collections;

class Card {
    public static enum Face {  //牌点
        Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
    }

    public static enum Suit {  //花色
        Clubs, Diamonds, Hearts, Spades
    }

    private final Face face;
    private final Suit suit;

    public Card(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    public Face getFace() {
        return face;
    }

    public Suit getSuit() {
        return suit;
    }

    public String getCard() {  //return a card
        return String.format("%s, %s", face, suit);
    }
}

class DeckOfCards {
    private List<Card> list;  //declaration list of cards
    public DeckOfCards(){  //generate cards and shuffle
        Card[] deck=new Card[52];  //total number is 52
        int count=0;  //number of cards

        //Initialize deck with cards
        for (Card.Suit suit:Card.Suit.values()){
            for (Card.Face face:Card.Face.values()){
                deck[count++]=new Card(face,suit);
            }
        }
        list=Arrays.asList(deck);
        Collections.shuffle(list);  //shuffle the cards
    }

    public void printCards(){  //Display all the cards in 4 columns
        for (int i=0;i<52;i++){
            System.out.printf("%-19s%s",list.get(i).getCard(),((i+1)%4==0)?"\n":"");
        }
    }
}

public class Dealer {
    public static void main(String[] args){
        DeckOfCards player=new DeckOfCards();
        player.printCards();
    }
}
