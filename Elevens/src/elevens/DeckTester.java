package elevens;

public class DeckTester {

	public static void main(String[] args) {
		
		String[] ranks = {Card.ACE, Card.TWO, Card.THREE};
		String[] suits = {Card.DIAMONDS, Card.CLUBS, Card.HEARTS, Card.SPADES};
		int[] pValues = {0, 0, 5, 10};
		
		Deck deck = new Deck(ranks, suits, pValues);
		System.out.println(deck);
		System.out.println(deck.deal());
		System.out.println(deck.deal());
	}

}
