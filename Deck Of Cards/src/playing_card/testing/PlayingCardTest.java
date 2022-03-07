package playing_card.testing;

import org.junit.Assert;
import org.junit.Test;

import playing_card.*;

public class PlayingCardTest
{
	@Test
	public void testConstructor()
	{
		PlayingCard ace = new PlayingCard(Suit.HEARTS, Value.ACE);
		PlayingCard two = new PlayingCard(Suit.DIAMONDS, Value.TWO);
		
		Assert.assertEquals(Suit.HEARTS, ace.getSuit());
		Assert.assertEquals(Suit.DIAMONDS, two.getSuit());
		Assert.assertEquals(Value.ACE, ace.getValue());
		Assert.assertEquals(Value.TWO, two.getValue());
	}
	
	@Test
	public void testComparison1()
	{
		PlayingCard ace = new PlayingCard(Suit.HEARTS, Value.ACE);
		PlayingCard two = new PlayingCard(Suit.HEARTS, Value.TWO);
		PlayingCard ace2 = new PlayingCard(Suit.HEARTS, Value.ACE);
		
		Assert.assertEquals(1, ace.compareTo(two));
		Assert.assertEquals(-1, two.compareTo(ace));
		Assert.assertEquals(0, ace.compareTo(ace2));
	}
	
	@Test
	public void testComparison2()
	{
		PlayingCard ace = new PlayingCard(Suit.CLUBS, Value.ACE);
		PlayingCard ace2 = new PlayingCard(Suit.HEARTS, Value.ACE);
		
		Assert.assertEquals(-1, ace.compareTo(ace2));
	}
	
	@Test
	public void testPrint()
	{
		PlayingCard ace = new PlayingCard(Suit.HEARTS, Value.ACE);
		PlayingCard two = new PlayingCard(Suit.HEARTS, Value.TWO);
		PlayingCard ace2 = new PlayingCard(Suit.HEARTS, Value.ACE);
		
		System.out.println(ace.printCard());
		System.out.println(two.printCard());
		System.out.println(ace2.printCard());
	}
}
