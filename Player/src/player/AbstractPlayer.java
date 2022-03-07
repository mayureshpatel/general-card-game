package player;

public abstract class AbstractPlayer
{
	// Instance Variables
	private String name;
	
	// Constructors
	/**
	 * Constructs a player given their name
	 * @param name the name of the player
	 */
	public AbstractPlayer(String name)
	{
		this.name = name;
	}
	
	// Methods
	/**
	 * Gets the name of the player
	 * @return the name
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * Gets a string representation of the player
	 * @return the string representation of the player
	 */
	public abstract String printPlayer();
}
