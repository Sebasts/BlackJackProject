package hellsing.whynot;

public class GameRoom implements CardGame {
	private BlackJack blackJack;
	
	public GameRoom() {
		
	}

	public void playBlackJack(){
		this.blackJack = new BlackJack();
		blackJack.start();
	}
		
}
