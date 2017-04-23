package hellsing.whynot;

public class Card {
	
    private Rank rank;
    private Suit suit;

    public Card(Rank r, Suit s) {
        rank = r;
        suit = s;
    }

    @Override
    public String toString() {
        return (rank + " of " + suit.getSuit()).toLowerCase();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((rank == null) ? 0 : rank.hashCode());
        result = prime * result
                + ((suit == null) ? 0 : suit.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Card other = (Card) obj;
        if (rank != other.rank)
            return false;
        if (suit != other.suit)
            return false;
        return true;
    }
    public int compare(Card card) {
        if (this.rank.ordinal() < card.rank.ordinal()) {
            return -1;
        }
        else if (this.rank.ordinal() > card.rank.ordinal()) {
            return 1;
        }
        else {
        	if (this.suit.ordinal() < card.suit.ordinal()) {
                return -1;
            }
            else if (this.suit.ordinal() > card.suit.ordinal()) {
                return 1;
            }else{
            	return 0;
            }
            
        }
    }

	public Rank getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}
    
	public int getValue(){
		return this.rank.getWorth();
	}
    
	public void flipValueTo11(){
		this.rank.setWorth(11);
	}
	
	public void flipValueTo1(){
		rank.setWorth(1);
	}
}
