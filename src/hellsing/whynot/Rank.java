package hellsing.whynot;

public enum Rank {

    TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(9), 
    JACK(10), QUEEN(10), KING(10), ACE(1,11);

	
	private int worth;
	private int worthAbove9;
	
	
	private Rank(int worth) {
		this.worth = worth;
	}


	private Rank(int worth, int worthAbove9) {
		this.worth = worth;
		this.worthAbove9 = worthAbove9;
	}
	
	
	
	

	
}	