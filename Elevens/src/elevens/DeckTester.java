package elevens;

public class DeckTester {

	public static void main(String[] args) {
		
		String[] RANKS = {Card.ACE, Card.TWO, Card.THREE, Card.FOUR, Card.FIVE, Card.SIX, Card.SEVEN, Card.EIGHT, Card.NINE, Card.TEN, Card.JOKER, Card.QUEEN, Card.KING};
		String[] SUITS = {Card.DIAMONDS, Card.CLUBS, Card.HEARTS, Card.SPADES};
		int[] P_VALUES = {1,2,3,4,5,6,7,8,9,10,0,0,0};
		
		Deck deck = new Deck(RANKS, SUITS, P_VALUES);
		
		System.out.println(deck);
		deck.shuffle();
		deck.deal();
		System.out.println(deck);
	}

}
