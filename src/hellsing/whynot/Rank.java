package hellsing.whynot;

public enum Rank {

    TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), 
    JACK(10), QUEEN(10), KING(10), ACE(1,11);

	
	private int worth;
	private int worthAbove10;
	
	
	private Rank(int worth) {
		this.worth = worth;
	}


	private Rank(int worth, int worthAbove10) {
		this.worth = worth;
		this.worthAbove10 = worthAbove10;
	}


	public int getWorth() {
		return worth;
	}


	
	
	public void setWorth(int i){
		worth = i;
	}
	
	

	
}	