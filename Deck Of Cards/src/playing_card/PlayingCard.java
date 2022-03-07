package playing_card;

import card.Card;

public class PlayingCard extends Card<PlayingCard>
{
	// Instance Variables
	private Suit suit;
	private Value value;
	
	// Constructors
	/**
	 * Constructs a playing card given the suit and value
	 * @param suit the suit
	 * @param value the value
	 */
	public PlayingCard(Suit suit, Value value)
	{
		this.suit = suit;
		this.value = value;
	}

	// Methods
	/**
	 * Gets the suit of the playing card
	 * @return the suit
	 */
	public Suit getSuit()
	{
		return this.suit;
	}
	
	/**
	 * Gets the value of the playing card
	 * @return the value
	 */
	public Value getValue()
	{
		return this.value;
	}
	
	/**
	 * Gets the string representation of this class
	 */
	public String toString()
	{
		return getClass().getName() + printCard();
	}
	
	@Override
	public int compareTo(PlayingCard otherCard)
	{
		if(this.suit.compareTo(otherCard.getSuit()) > 0)
		{
			return 1;
		}
		else if(this.suit.compareTo(otherCard.getSuit()) < 0)
		{
			return -1;
		}
		else
		{
			if(this.value.compareTo(otherCard.getValue()) > 0)
			{
				return 1;
			}
			else if(this.value.compareTo(otherCard.getValue()) < 0)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		}
	}

	@Override
	public String printCard()
	{
		return "[suit=" + this.suit.toString() + "][value=" + this.value.toString() + "]";
	}
}
