package playing_card;

import java.util.ArrayDeque;

import deck.Deck;

public class PlayingCardDeck extends Deck<PlayingCard>
{
	// Instance Variables
	
	// Constructors
	/**
	 * Constructs a deck of playing cards
	 * @param cards the list of cards in the deck
	 */
	public PlayingCardDeck(ArrayDeque<PlayingCard> cards)
	{
		super(cards);
	}
	
	/**
	 * Default playing card deck constructor. Makes a standard deck
	 * of playing cards with a total of 52 cards; 4 suits containing
	 * 13 cards each from Ace to King.
	 */
	public PlayingCardDeck()
	{
		super(constructStandardDeck());
	}
	
	// Methods
	/**
	 * Helper method to construct a standard deck of playing cards
	 * @return the constructed list of cards that are in a standard
	 * deck of cards
	 */
	private static ArrayDeque<PlayingCard> constructStandardDeck()
	{
		ArrayDeque<PlayingCard> playingCards = new ArrayDeque<>();
		
		for(Suit s : Suit.values())
		{
			for(Value v : Value.values())
			{
				playingCards.add(new PlayingCard(s, v));
			}
		}
		return playingCards;
	}
}
