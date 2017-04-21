package hellsing.whynot;

import java.util.Scanner;

public class BlackJack {
	private Deck deck;
	private Player player;
	private Player dealer;
	private Scanner in;

	public BlackJack() {
		deck = new Deck();
		player = new Player("Gambler", new Hand());
		dealer = new Player("Dealer", new Hand(), deck);
		in = new Scanner(System.in);
		start();
	}

	public void start() {
		System.out.println("\nWelcome to the Table");
		System.out.println("The card person is dealing the cards.");
		dealer.getDeck().shuffle();
		dealer.dealCards(dealer, player);
		gameLogic();
	}

	private void gameLogic() {
		Scanner in = new Scanner(System.in);
		boolean gameOver = false;
		int userChoice = 0;
		firstHand(in);
	}

	private boolean processUserChoice(int choice) {

		switch (choice) {
		case 1:
			dealer.dealSingleCard(player);
			return checkForWin();
		case 0:
			dealer.dealSingleCard(dealer);
			return checkForWin();
		}
		return false;

	}

	private boolean checkForWin() {
		if (player.getValueOfHand() == 21 && dealer.getValueOfHand() != 21) {
			System.out.println("Player has Won!");
			return true;
		} else if (dealer.getValueOfDealerHiddenHand() == 1) {
			if (dealer.getValueOfHand() - 11 == 10 && player.getValueOfHand() != 21) {
				System.out.println("The cheater... I mean Dealer has Won!");
				return true;
			}
		} else if (player.getValueOfHand() == 21 && dealer.getValueOfHand() == 21) {
			System.out.println("The game is a tie!");
			return true;
		} else if (player.getValueOfHand() > 21) {
			System.out.println("The cheater... I mean Dealer has Won!");
			return true;
		} else if (dealer.getValueOfHand() > 21) {
			System.out.println("The Player has Won!");
			return true;
		}
		
		return false;
	}

	public void firstHand(Scanner in) {
		boolean gameOver = false;
		int userChoice = 0;
		while (!gameOver) {
			System.out.println("\nYour hand is ||" + player.getHand().getHand() + "||");
			System.out.println("\n\n The dealer has ||" + dealer.getDealersHand() + " and a card upside down||");
			player.reconcileValues();
			dealer.reconcileValues();

			if (checkForWin()) {
				return;
			}

			System.out.println("Would you like to hit or stay? 1 to hit 0 to stay.");

			try {
				userChoice = in.nextInt();
			} catch (Exception e) {
				System.err.println(
						"That was not a valid input. You have been" + " beaten up ad thrown out of the game room.");
				System.exit(1);
			}
			if (userChoice != 1 && userChoice != 0) {
				System.err.println(
						"That was not a valid input. You have been" + " beaten up ad thrown out of the game room.");
				System.exit(1);
			}
			processUserChoice(userChoice);
			gameOver = checkForWin();
		}
	}

	public void nextTurn() {

		boolean gameOver = false;
		int userChoice = 0;
		while (!gameOver) {

			System.out.println("\nYour hand is ||" + player.getHand().getHand() + "||");
			System.out.println("\n\n The dealer has ||" + dealer.getHand().getHand() + " and a card upside down||");
			player.reconcileValues();
			dealer.reconcileValues();
			if (checkForWin()) {
				return;
			}
			System.out.println("Would you like to hit or stay? 1 to hit 0 to stay.");

			try {
				userChoice = in.nextInt();
			} catch (Exception e) {
				System.err.println(
						"That was not a valid input. You have been" + " beaten up ad thrown out of the game room.");
				System.exit(1);
			}
			if (userChoice != 1 && userChoice != 0) {
				System.err.println(
						"That was not a valid input. You have been" + " beaten up ad thrown out of the game room.");
				System.exit(1);
			}
			processUserChoice(userChoice);
			gameOver = checkForWin();
		}
	}

	// public void boardUpdater(){
	// board = new ArrayList<>();
	//
	// }

	// public void displayBoard(){
	// }

}
