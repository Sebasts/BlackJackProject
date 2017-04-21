package hellsing.whynot;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	private List<Card> cards = new ArrayList<>();

	
	
	public Hand() {
		
	}
	
	
	public List<Card> getHand(){
		return cards;
	}
	
	public void addCard(Card card){
		cards.add(card);
	}
	
	public String getHand(){
		
		return cards.toString();
		
	}
	
	
}
