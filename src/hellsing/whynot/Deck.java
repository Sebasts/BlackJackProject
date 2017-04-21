package hellsing.whynot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> deck = new ArrayList<Card>();

	public Deck() {
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				this.deck.add(new Card(r, s));
			}
		}
	}
	
	
	
	public List<Card> getDeck(){
		return deck;
	}
	
	public Card dealCard(){
		int index = (int)(1+(Math.random() * deck.size())-1);
		
		Card temp = deck.get(index);
		return temp;
		
	}
	public void shuffle(){
		Collections.shuffle(deck);
	}
}
