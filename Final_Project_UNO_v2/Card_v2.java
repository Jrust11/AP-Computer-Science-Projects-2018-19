//Names: Jacob Rust & Aiden McCallister
//Project: Final Project(Uno)
//Date: 05/23/19

public class Card 

{

	private char color;		// R G B Y W

	private char value;		// 1 2 3 4 5 6 7 8 9 s r t(two) f(four) n(null) u(used skip) d(deck Swap) x(Double hand)



	/**

	 * Constructs a new Card with the give value and suit

	 * (Note that 10 has a char value of 0.)

	 * @param s suit of card

	 * @param v value of card

	 */

	public Card(char c, char v)

	{

		color = c;

		value = v;

	}



	/**

	 * Returns the suit of the card.

	 * @return suit

	 */

	public char getColor()

	{

		return color;

	}



	/**

	 * Returns the value of the card (A23...0JQK)

	 * (0 means a 10)

	 * @return value

	 */

	public char getValue()

	{

		return value;

	}
	
	public void setColor(char c)
	{
		color = c;
	}
	
	public void setValue(char v)
	{
		value = v;
	}


	

	

}