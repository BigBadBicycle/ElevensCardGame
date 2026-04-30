package elevens;

public class Card
{
	//Suits
	public static String HEARTS = "Hearts";
	public static String SPADES = "Spades";
	public static String CLUBS = "Clubs";
	public static String DIAMONDS = "Diamonds";
	
	//Ranks
	public static String ACE = "Ace";
	public static String TWO = "Two";
	public static String THREE = "Three";
	public static String FOUR = "Four";
	public static String FIVE = "Five";
	public static String SIX = "Six";
	public static String SEVEN = "Seven";
	public static String EIGHT = "Eight";
	public static String NINE = "Nine";
	public static String TEN = "Ten";
	public static String JOKER = "Joker";
	public static String QUEEN = "Queen";
	public static String KING = "King";
	
// String value that holds the suit of the card
private String suit;
// String value that holds the rank of the card
private String rank;
// int value that holds the point value.
private int pointValue;
/**
* @param cardRank a <code>String value
* containing the rank of the card
* @param cardSuit a <code>String value
* containing the suit of the card
* @param cardPointValue an <code>int value
* containing the point value of the card
*/
public Card(String cardRank, String cardSuit, int cardPointValue)
{
	rank = cardRank;
	suit = cardSuit;
	pointValue = cardPointValue;
	
}
/**
* Accesses this Card's suit.
* @return this Card's suit.
*/
public String suit(){return suit;}

/**
* Accesses this Card's rank.
* @return this Card's rank.
*/
public String rank(){return rank;}

/**
* Accesses this <code>Card's point value.
* @return this <code>Card's point value.
*/
public int pointValue(){return pointValue;}

/** Compare this card with the argument.
* @param otherCard the other card to compare to this
* @return true if the rank, suit, and point value of this card
* are equal to those of the argument;
* false otherwise.
*/
public boolean matches(Card otherCard)
{
if(suit == otherCard.suit() && rank == otherCard.rank() && pointValue == otherCard.pointValue())
	return true;

return false;
}
/**
* @return a String containing the rank, suit,
* and point value of the card.
*/
@Override
public String toString(){return rank+" of "+suit+" (point value = "+pointValue+")";}
}