package calm.js;

import java.util.ArrayList;
import java.util.List;

public class Player {

private List<Card> hand  = new ArrayList<Card>();
	

	
	private int score;
	
	private String name;
	
	public Player(String name) {
	this.name = name;
	 score = 0;
	}
	
	public void describe() {
		System.out.println("Player: " + name);
		
		for(Card card : hand)	{
			System.out.println(card);
		}
	}
	public Card	flip() {
		
		
			Card flipCard = hand.get(0);
			hand.remove(0);
			
			
		
		return flipCard;
	
		
	}
	
	///public Card draw(Deck cards) {
		//Card pulled = cards.draw;
		
		
		//return cards;
		
	//}
	public void draw(Deck deck) {
		Card drawn = deck.pullCard();
		hand.add(drawn);
	}

	public int getScore() {
		return score;
	}

	public void incrementScore()	{
		score += 1;
	}
}
