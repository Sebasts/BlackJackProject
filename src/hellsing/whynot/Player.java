package hellsing.whynot;

public class Player {

	private String name;
	private Hand hand;
	private int valueOfHand;
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

	public int hitMe() {
		return 1;
	}

	public int stay() {
		return 0;
	}

	public void dealCards(Player... args) {

		for (Player player : args) {
			player.addCardToHand(deck.dealCard());
			player.addCardToHand(deck.dealCard());
		}
	}
	public void dealSingleCard(Player player){
		player.addCardToHand(deck.dealCard());
	}

	public void addCardToHand(Card card) {
		hand.addCard(card);
	}

	public Hand getHand() {
		return hand;
	}

	public String getDealersHand() {
		return hand.getHiddenHand();
	}

	public Deck getDeck() {
		return deck;
	}

	public void valuateHand() {
		
		for(Card card : hand.getCards()){
			valueOfHand += card.getValue();
		}
	}
	public int getValueOfHand(){
		return valueOfHand;
	}
	public int getValueOfDealerHiddenHand(){
		return hand.getnotHiddenDealerValue();
	}
	public void reconcileValues(){
		for (Card card : hand.getCards()) {
			if(card.getRank().equals(Rank.ACE)){
				if(getValueOfHand() - 1 <= 10){
					card.flipValueTo11();
				} else{
					card.flipValueTo1();
				}
			}
		}
	}
}
