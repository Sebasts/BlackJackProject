package hellsing.whynot;

public class Player {
	
	private String name;
	private Hand hand;
	Deck deck;
	
	public Player(String name, Hand hand) {
		this.name = name;
		this.hand = hand;
	}
	public Player(String name, Hand hand, Deck deck) {
		this.name = name;
		this.hand = hand;
		this.deck = deck;
	}
	
	public int hitMe(){
		return 1;
	}
	public int stay(){
		return 0;
	}
	
	public void dealCards(Player...args){
		
		for (Player player : args) {
			player.addCardToHand(deck.dealCard());
			player.addCardToHand(deck.dealCard());
		}
	}
	
	public void addCardToHand(Card card){
		hand.addCard(card);
	}
	
	public Hand getHand(){
		return hand;
	}
}
