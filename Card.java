
public class Card {
	enum Suit {
		Clubs, Diamonds, Hearts, Spades
	}

	private Suit suit; // Definition: 1~4, Clubs=1, Diamonds=2,
						// Hearts=3,Spades=4

	private int rank; // 1~13
	private String[] rank1 = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	/**
	 * @param s
	 *            suit
	 * @param r
	 *            rank
	 * @return
	 */
	public Card(Suit s, int r) {
		suit = s;
		rank = r;
	}

	// TODO: 1. Please implement the printCard method (20 points, 10 for suit,
	// 10 for rank)
	public void printCard() {
		// Hint: print (System.out.println) card as suit,rank, for example:
		// print 1,1 as Clubs Ace

		System.out.println(suit + "," + rank1[rank - 1]);

	}

	public Suit getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}
}