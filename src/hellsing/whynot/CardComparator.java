package hellsing.whynot;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {

	@Override
	public int compare(Card a, Card b) {

		if (a.getRank().ordinal() < b.getRank().ordinal()) {
			return -1;
		} else if (a.getRank().ordinal() > b.getRank().ordinal()) {
			return 1;
		} else {
			if (a.getSuit().ordinal() < b.getSuit().ordinal()) {
				return -1;
			} else if (a.getSuit().ordinal() > b.getSuit().ordinal()) {
				return 1;
			} else {
				return 0;
			}
		}
	}

}
