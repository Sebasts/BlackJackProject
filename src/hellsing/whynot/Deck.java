package hellsing.whynot;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Deck {
	List<Card> deck = new ArrayList<Card>();

	public Deck() {
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(r, s));
			}
		}

		for (Card card : deck) {
			System.out.println(card);
		}
	}
	
	
	
	public List<Card> getDeck(){
		return deck;
	}
	
	public Card dealCard(){
		int index = (int)(1+(Math.random() * deck.size()));
		
		Card temp = deck.get(index);
		return temp;
		
	}
}
