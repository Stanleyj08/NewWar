package calm.js;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards  = new ArrayList<Card>();
	
	public Deck()	{
		//Hearts
		cards.add(new Card("Ace of Hearts", 14));
		cards.add(new Card("One of Hearts", 1));
		cards.add(new Card("Two of Hearts", 2));
		cards.add(new Card("Three of Hearts", 3));
		cards.add(new Card("Four of Hearts", 4));
		cards.add(new Card("Five of Hearts", 5));
		cards.add(new Card("Six of Hearts", 6));
		cards.add(new Card("Seven of Hearts", 7));
		cards.add(new Card("Eight of Hearts", 8));
		cards.add(new Card("Nine of Hearts", 9));
		cards.add(new Card("Ten of Hearts", 10));
		cards.add(new Card("Jack of Hearts", 11));
		cards.add(new Card("Queen of Hearts", 12));
		cards.add(new Card("King of Hearts", 13));
		//Spades
		cards.add(new Card("Ace of Spades", 14));
		cards.add(new Card("One of Spades", 1));
		cards.add(new Card("Two of Spades", 2));
		cards.add(new Card("Three of Spades", 3));
		cards.add(new Card("Four of Spades", 4));
		cards.add(new Card("Five of Spades", 5));
		cards.add(new Card("Six of Spades", 6));
		cards.add(new Card("Seven of Spades", 7));
		cards.add(new Card("Eight of Spades", 8));
		cards.add(new Card("Nine of Spades", 9));
		cards.add(new Card("Ten of Spades", 10));
		cards.add(new Card("Jack of Spades", 11));
		cards.add(new Card("Queen of Spades", 12));
		cards.add(new Card("King of Spades", 13));
		//Diamonds
		cards.add(new Card("Ace of Diamonds", 14));
		cards.add(new Card("One of Diamonds", 1));
		cards.add(new Card("Two of Diamonds", 2));
		cards.add(new Card("Three of Diamonds", 3));
		cards.add(new Card("Four of Diamonds", 4));
		cards.add(new Card("Five of Diamonds", 5));
		cards.add(new Card("Six of Diamonds", 6));
		cards.add(new Card("Seven of Diamonds", 7));
		cards.add(new Card("Eight of Diamonds", 8));
		cards.add(new Card("Nine of Diamonds", 9));
		cards.add(new Card("Ten of Diamonds", 10));
		cards.add(new Card("Jack of Diamonds", 11));
		cards.add(new Card("Queen of Diamonds", 12));
		cards.add(new Card("King of Diamonds", 13));
		//Clubs
		cards.add(new Card("Ace of clubs", 14));
		cards.add(new Card("One of clubs", 1));
		cards.add(new Card("Two of clubs", 2));
		cards.add(new Card("Three of clubs", 3));
		cards.add(new Card("Four of clubs", 4));
		cards.add(new Card("Five of clubs", 5));
		cards.add(new Card("Six of clubs", 6));
		cards.add(new Card("Seven of clubs", 7));
		cards.add(new Card("Eight of clubs", 8));
		cards.add(new Card("Nine of clubs", 9));
		cards.add(new Card("Ten of clubs", 10));
		cards.add(new Card("Jack of clubs", 11));
		cards.add(new Card("Queen of clubs", 12));
		cards.add(new Card("King of clubs", 13));
	}
 //private Card[] deck = new Card[52];	
//private int topCard;
	//Deck()	{
		//topCard = 0;
		//for(int i =0; i < deck.length; i++)	{
			//deck[i] = new Card(i);
	
		//}
	public void shuffle() {
		Collections.shuffle(cards);
		
	}
	public Card pullCard(){
		Card pulled = cards.get(0);
		Card.remove(0);
		return pulled;
		
	}
	
}

