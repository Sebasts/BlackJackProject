package hellsing.whynot;

public enum Suit {
    HEARTS("\u2665"), SPADES("\u2660"), CLUBS("\u2666"), DIAMONDS("\u2663");

	private String suit;

	
	
	private Suit(String suit) {
		this.suit = suit;
	}



	public String getSuit() {
		return suit;
	}
    
    
}
