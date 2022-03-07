package deck;

import java.util.ArrayDeque;

import card.Card;

public abstract class Deck<T extends Card<T>> 
{
	// Instance Variables
	protected ArrayDeque<T> cards;
	
	// Constructors
	/**
	 * Constructs a deck
	 * @param cards the cards to construct the deck out of
	 */
	public Deck(ArrayDeque<T> cards)
	{
		this.cards = cards;
	}
	
	// Methods
	/**
	 * Gets the array of cards that is this deck
	 * @return the array of cards
	 */
	public ArrayDeque<T> getCards()
	{
		return this.cards;
	}
	
	/**
	 * Gets the number of cards in this deck
	 * @return the number of cards
	 */
	public int getNumberOfCards()
	{
		return this.cards.size();
	}
}
