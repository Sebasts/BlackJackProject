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
		
		Card temp = deck.dealCard();
		player.addCardToHand(temp);
		deck = new Deck();
		deck.getDeck().remove(temp);
		
	}

	public void addCardToHand(Card card) {
		hand.addCard(card);
		valuateHand(card);
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

	public void valuateHand(Card card) {
		valueOfHand += card.getRank().getWorth();
	}
	public void reevaluateHand(){
		valueOfHand = 0;
		for (Card card : hand.getCards()) {
			valueOfHand += card.getRank().getWorth();
		}
	}
	public int getValueOfHand(){
		return valueOfHand;
	}
	public int getValueOfDealerHiddenHand(){
		return hand.getnotHiddenDealerValue();
	}
	public void reconcileValues(){
		for (Card card : this.hand.getCards()) {
			if(card.getRank().equals(Rank.ACE)){
				if((this.valueOfHand - 1) <= 10 || this.valueOfHand < 21){
					card.flipValueTo11();
					reevaluateHand();
				} else if(this.valueOfHand > 21){
					card.flipValueTo1();
				}
				else{
					card.flipValueTo1();
					reevaluateHand();
				}
			}
		}
	}
}
