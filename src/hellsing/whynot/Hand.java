package hellsing.whynot;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	private List<Card> cards = new ArrayList<>();

	
	
	public Hand() {
		
	}
	
	
	public String getHand(){
		StringBuilder sb = new StringBuilder();
		for (Card card : cards) {
			sb.append(card.toString() + " : ");
		}
		return sb.toString();
	}
	public String getHiddenHand(){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i< cards.size()-1; i++) {
			sb.append(cards.get(i).toString() + " : ");
		}
		return sb.toString();
	}
	
	public void addCard(Card card){
		cards.add(card);
	}
	
	public List<Card> getCards(){
		
		return cards;
	}
	
	public int getnotHiddenDealerValue(){
		return cards.get(0).getValue();
	}
	
	

	
	
}
