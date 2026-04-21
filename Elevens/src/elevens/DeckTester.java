package elevens;

public class DeckTester {

	public static void main(String[] args) {
		
		String[] ranks = {Card.ACE, Card.TWO, Card.THREE, Card.FOUR, Card.FIVE, Card.SIX, Card.SEVEN, Card.EIGHT, Card.NINE, Card.TEN, Card.JOKER, Card.QUEEN, Card.KING};
		String[] suits = {Card.DIAMONDS, Card.CLUBS, Card.HEARTS, Card.SPADES};
		int[] pValues = {0,2,3,4,5,6,7,8,9,10,0,0,0};
		
		Deck deck = new Deck(ranks, suits, pValues);
		System.out.println(deck);
		System.out.println(deck.deal());
		System.out.println(deck.deal());
	}

}
