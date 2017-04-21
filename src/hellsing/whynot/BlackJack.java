package hellsing.whynot;

public class BlackJack {
	Deck deck;
	Player player;
	Player dealer;

	public BlackJack() {
		player = new Player("Gambler",new Hand());
		dealer = new Player("Dealer", new Hand(), deck);
		start();
	}
	
	public void start(){
		System.out.println("\nWelcome to the Table");
		System.out.println("The card person is dealing the cards.");
		dealer.dealCards(dealer, player);
		gameLogic();
	}

	private void gameLogic() {
		
		boolean gameOver = false;
		
		
		while(!gameOver){
			System.out.println("You have "+ player.getHand().);
			
		}
	}
	
	
	
//	public void boardUpdater(){
//		board = new ArrayList<>();
//		
//	}
	
//	public void displayBoard(){
//	}
	
}
