import java.util.ArrayList;
import java.util.Random;


public class DeckOfCards 
{
	// Instance Variables
	/* You will need some sort of collection to hold the cards */
	ArrayList<Card> deck = new ArrayList<Card>();

	/**
	 * Constructs a new uno complete deck with one of each card.
	 */
	public DeckOfCards()
	{
		for(int i = 1; i <= 4; i++)
			for(int j = 1; j <= 12; j++)
			{
				deck.add(new Card(intToCharColor(i), intToCharVal(j)));
				deck.add(new Card(intToCharColor(i), intToCharVal(j)));
			}
		
		for(int k = 13; k <= 14; k++)
			for(int x = 1; x <= 4; x++)
			deck.add(new Card(intToCharColor(5), intToCharVal(k)));
		
		deck.add(new Card('R','d'));
		deck.add(new Card('G','d'));
		deck.add(new Card('B','d'));
		deck.add(new Card('Y','d'));
		
		deck.add(new Card('R','x'));
		deck.add(new Card('G','x'));
		deck.add(new Card('B','x'));
		deck.add(new Card('Y','x'));

	}

	/**
	 * Shuffles the deck into a random order.
	 */
	public void shuffle()
	{
		ArrayList<Card> newDeck = new ArrayList<Card>();
		while(deck.size() > 0)
		{
			int index = (int)(Math.random()*deck.size());
			newDeck.add(deck.remove(index));
		}
		deck = newDeck;
	}

	/**
	 * Removes and returns the top Card from the Deck
	 * @return the top Card from the Deck
	 */
	public Card deal()
	{
		return deck.remove(0);
	}
	
	public char intToCharVal(int num){
		if (num == 1)
			return '1';
		else if (num == 2)
			return '2';
		else if (num == 3)
			return '3';
		else if (num == 4)
			return '4';
		else if (num == 5)
			return '5';
		else if (num == 6)
			return '6';
		else if (num == 7)
			return '7';
		else if (num == 8)
			return '8';
		else if (num == 9)
			return '9';
		else if (num == 10)
			return 's';
		else if (num == 11)
			return 'r';
		else if (num == 12)
			return 't';
		else if (num == 13)
			return 'f';
		else if (num == 14)
			return 'n';
		else
			return 'x';
	}
	
	public char intToCharColor(int num){
		if (num == 1)
			return 'R';
		else if (num == 2)
			return 'G';
		else if (num == 3)
			return 'B';
		else if (num == 4)
			return 'Y';
		else if (num == 5)
			return 'W';
		else 
			return 'X';
		
	}
	
	public int size()
	{
		return deck.size();
	}
	
	public Card get(int i)
	{
		return deck.get(i);
	}
	
	public static boolean canPlay(Card lastPlayed, ArrayList<Card> playerHand)
	{
		boolean playableCardFound = false;
		for(int i = 0; i < playerHand.size(); i++)
		{
			if (playerHand.get(i).getColor() == lastPlayed.getColor() || playerHand.get(i).getValue() == lastPlayed.getValue() || playerHand.get(i).getColor() == 'W')
				playableCardFound = true;
			
			if(lastPlayed.getValue() == 'u' || lastPlayed.getValue() == 's')
				if(playerHand.get(i).getValue() == 's')
					playableCardFound = true;
		}
		return playableCardFound;
	}
	
	public static boolean canCardPlay(Card lastPlayed, Card playerCard)
	{
		boolean canPlay = false;
		if (playerCard.getColor() == lastPlayed.getColor() || playerCard.getValue() == lastPlayed.getValue() || playerCard.getColor() == 'W')
			canPlay = true;
		
		if(lastPlayed.getValue() == 'u' || lastPlayed.getValue() == 's')
				if(playerCard.getValue() == 's')
					canPlay = true;
				
		return canPlay;
	}
	
	public void add(Card card){
		deck.add(card);
	}
	
	public void add(int i, Card card){
		deck.add(i, card);
	}
	
	public Card remove(int i){
		return deck.remove(i);
	}
	
	public ArrayList<Card> arrayDeck()
	{
		return deck;
	}
	
	
	public void recycleTrash(ArrayList<Card> trash)
	{
		while(trash.size() > 0)
		{
			int index = (int)(Math.random()*trash.size());
			Card card = trash.remove(index);
			
			if(card.getValue() == 'f' || card.getValue() == 'n')
				card.setColor('W');
			
			if(card.getValue() == 'u')
				card.setValue('s');
			
			deck.add(card);
		}
		
	}
	
	public static String easyReadCard(Card card)
	{
		String stringForm = "";
		
		if(card.getColor() == 'W')
			stringForm = stringForm + "Wild";
		else if(card.getColor() == 'R')
			stringForm = stringForm + "Red";
		else if(card.getColor() == 'Y')
			stringForm = stringForm + "Yellow";
		else if(card.getColor() == 'G')
			stringForm = stringForm + "Green";
		else if(card.getColor() == 'B')
			stringForm = stringForm + "Blue";
		else if(card.getColor() == 'N')
			stringForm = stringForm + "Null";
		
		if(card.getValue() == 's' || card.getValue() == 'u')
			stringForm = stringForm + " (skip)";
		else if(card.getValue() == 'r')
			stringForm = stringForm + " (reverse)";
		else if(card.getValue() == 't')
			stringForm = stringForm + " (plus two)";
		else if(card.getValue() == 'f')
			stringForm = stringForm + "(plus four)";
		else if(card.getValue() == 'n')
			stringForm = stringForm + " (null)";
		else 
			stringForm = stringForm + " (" +card.getValue() + ")";
		return stringForm;
	}
	//swaps two hands
	public static ArrayList<Card> swap(ArrayList<Card> handOne, ArrayList<Card> handTwo){
		ArrayList<Card> temp = handTwo;
		handTwo = handOne;
		handOne = temp;
		return handOne;
	}
	
	public void reDeal(){
		
	}
	
	public static void main(String[] args)
	{
		EasyReader console = new EasyReader();
		DeckOfCards mainDeck = new DeckOfCards();
		mainDeck.shuffle();
		ArrayList<Card> trash = new ArrayList<Card>();
		int order = 0;
		Card lastPlayed;
		boolean[] isBot = new boolean[4];
		isBot[0] = true;
		isBot[1] = true;
		isBot[2] = true;
		isBot[3] = true;
		
		//creates an array list of hands(array lists)
		ArrayList<ArrayList<Card>> hands = new ArrayList<ArrayList<Card>>();
		ArrayList<Card> handOne = new ArrayList<Card>();
		ArrayList<Card> handTwo = new ArrayList<Card>();
		ArrayList<Card> handThree = new ArrayList<Card>();
		ArrayList<Card> handFour = new ArrayList<Card>();
		
		hands.add(handOne);
		hands.add(handTwo);
		hands.add(handThree);
		hands.add(handFour);
		
		boolean gameWon = false;
		boolean clockWise = true;
		
		for(int i = 0; i<7; i++)
		{
			hands.get(0).add(mainDeck.deal());
		}
		
		for(int i = 0; i<7; i++)
		{
			hands.get(1).add(mainDeck.deal());
		}
		
		for(int i = 0; i<7; i++)
		{
			hands.get(2).add(mainDeck.deal());
		}
		
		for(int i = 0; i<7; i++)
		{
			hands.get(3).add(mainDeck.deal());
		}
		
		trash.add(mainDeck.deal());
		lastPlayed = trash.get(0);
		
		if(lastPlayed.getColor() == 'W')
		{
			Random rand = new Random();
			int selection = rand.nextInt(4) +1;
			if(selection == 1)
				lastPlayed.setColor('R');
			else if(selection == 2)
				lastPlayed.setColor('G');
			else if(selection == 3)
				lastPlayed.setColor('B');
			else 
				lastPlayed.setColor('Y');
		}
		
		while(!gameWon)
		{
			
			System.out.println("Player " + (order + 1) + " is going");
			boolean skip = false;
			
			//check if last played card was a +2 card
			if(lastPlayed.getValue() == 't')
			{
				System.out.println("Player " + (order + 1) + " is drawing 2 cards");
				
				for(int i = 1; i <= 2; i++) 
				{
					hands.get(order).add(mainDeck.deal());
					if (mainDeck.size() == 0)
						mainDeck.recycleTrash(trash);
				}
			
			}
			
			//checks if last played card was a +4
			if(lastPlayed.getValue() == 'f')
			{
				System.out.println("Player " + (order + 1) + " is drawing 4 cards");
				for(int i = 1; i <= 4; i++) 
				{
					hands.get(order).add(mainDeck.deal());
					if (mainDeck.size() == 0)
						mainDeck.recycleTrash(trash);
				}
				
			}
			
			//checks if last played card was a +4
			if(lastPlayed.getValue() == 'x')
			{
				int handSize = hands.get(order).size();
				System.out.println("Player " + (order + 1) + "'s hand has been doubled");
				for(int i = 1; i <= handSize; i++) 
				{
					hands.get(order).add(mainDeck.deal());
					if (mainDeck.size() == 0)
						mainDeck.recycleTrash(trash);
				}
				
			}
			
			//checks if last played card was a skip
			if(lastPlayed.getValue() == 's'){
				lastPlayed.setValue('u');
				skip = true;
			}
			
			// Checks if mainDeck is empty, if empty puts all trash cards
			// into main deck
			if (mainDeck.size() == 0)
				mainDeck.recycleTrash(trash);
			
			
			if(isBot[order]) //bot play (plays first applicable card)
			{
				if(!skip){
				//checks if player has a playable card, if no draws until a playable card is found
				while (!canPlay(trash.get(trash.size() - 1), hands.get(order))) 
				{
					hands.get(order).add(mainDeck.deal());
					if (mainDeck.size() == 0)
						mainDeck.recycleTrash(trash);
				}
				
				//bot card selection
				boolean cardFound = false;
				Card card = new Card('n','N');
				int playablePlusFour = -1, playablePlusTwo = -1, playableReverse = -1, playableSkip = -1, playableReg = -1, playableDouble = -1, playableSwap = -1;
				int i, selected = 0; 
				for(i = 0; i < hands.get(order).size(); i++)
				{
					if(canCardPlay(lastPlayed, hands.get(order).get(i)))
					{
						if(hands.get(order).get(i).getValue() == 'f')
							playablePlusFour = i;
						else if(hands.get(order).get(i).getValue() == 's')
							playableSkip = i;
						else if(hands.get(order).get(i).getValue() == 'r')
							playableReverse = i;
						else if(hands.get(order).get(i).getValue() == 't')
							playablePlusTwo = i;
						else if(hands.get(order).get(i).getValue() == 'x')
							playableDouble = i;
						else if(hands.get(order).get(i).getValue() == 'd')
							playableSwap = i;
						else
							playableReg = i;
					}
				}
				
				if(playablePlusFour != -1)
					selected = playablePlusFour;
				else if(playableDouble != -1)
					selected = playableDouble;
				else if(playableSwap != -1)
					selected = playableSwap;
				else if (playablePlusTwo != -1)
					selected = playablePlusTwo;
				else if (playableSkip != -1)
					selected = playableSkip;
				else if (playableReverse != -1)
					selected = playableReverse;
				else 
					selected = playableReg;
				
				trash.add(hands.get(order).get(selected));
				card = hands.get(order).remove(selected);
				
				//if card selected is a wild card (sets the wild card to the same color that is most common in player hand
				if(card.getColor() == 'W')
				{
					//counters
					int r = 0;
					int g = 0;
					int b = 0;
					int y = 0;
					
					//counting total of each color in hand of player
					for(i = 0; i< hands.get(order).size(); i++)
					{
						if(hands.get(order).get(i).getColor() == 'R')
							r++;
						if(hands.get(order).get(i).getColor() == 'G')
							g++;
						if(hands.get(order).get(i).getColor() == 'Y')
							y++;
						if(hands.get(order).get(i).getColor() == 'B')
							b++;
					}
					
					char greatest = 'N';
					
					if(r >= y && r >= g && r >= b)
						greatest = 'R';
					else if(y >= r && y >= g && y >= b) 
						greatest = 'Y';
					else if(g >= r && g >= y && g >= b) 
						greatest = 'G';
					else if(b >= r && b >= g && b >= y) 
						greatest = 'B';
					
					card.setColor(greatest);
					
				}
				
				lastPlayed = card;
				System.out.println("Player " + (order + 1) + " has played " + easyReadCard(card));
				}
				
				
				if(lastPlayed.getValue() == 'd')
				{
					
					int smallestHand;
					if(order == 0){
						smallestHand = 1;
						if(hands.get(2).size() < hands.get(smallestHand).size())
							smallestHand = 2;
						if(hands.get(3).size() < hands.get(smallestHand).size())
							smallestHand = 3;
					} 
					else if (order == 1)
					{
						smallestHand = 2;
						if(hands.get(0).size() < hands.get(smallestHand).size())
							smallestHand = 2;
						if(hands.get(3).size() < hands.get(smallestHand).size())
							smallestHand = 3;
					}
					else if(order == 2)
					{
						smallestHand = 1;
						if(hands.get(0).size() < hands.get(smallestHand).size())
							smallestHand = 0;
						if(hands.get(3).size() < hands.get(smallestHand).size())
							smallestHand = 3;
					}
					else
					{
						smallestHand = 2;
						if(hands.get(1).size() < hands.get(smallestHand).size())
							smallestHand = 1;
						if(hands.get(0).size() < hands.get(smallestHand).size())
							smallestHand = 0;
					}
					ArrayList<Card> termp
					swap(hands.get(order), hands.get(smallestHand));
					System.out.println("Player" + (order+1) + " is swapping hands with player " + (smallestHand + 1));
				}
			}
			else //player play
			{
				
				if(!skip)
				{
					

					System.out.println("Last card played: " + easyReadCard(lastPlayed));

					while (!canPlay(lastPlayed, hands.get(order))) 
					{
						System.out.println("You have no playable cards. Draw 1");
						hands.get(order).add(mainDeck.deal());

						if (mainDeck.size() == 0)
							mainDeck.recycleTrash(trash);
					}

					System.out.println("All cards in your hand");
					for (int i = 0; i <= hands.get(order).size() - 1; i++)
						System.out.println((i + 1) + ": " + easyReadCard(hands.get(order).get(i)));
					
					//card selection
					boolean validSelection = false;
					while (!validSelection) 
					{
						System.out.println("Make your selection: ");
						int selection = console.readInt() - 1;
						if (selection < 0 || selection > (hands.get(order).size() - 1))
							System.out.println("Not a valid selection");
						else 
						{
							
							if (!canCardPlay(trash.get(trash.size() - 1), hands.get(order).get(selection)))
								System.out.println("Card can not be played");
							else 
							{
								validSelection = true;
								trash.add(hands.get(order).get(selection));
								
								if (hands.get(order).get(selection).getColor() == 'W') 
								{
									System.out.println("wild detected");
									boolean validColor = false;
									console.readChar();
									while (!validColor) 
									{
										System.out.println("Make color selection for wild(R-Red)(G-Green)(Y-Yellow)(B-Blue)");
										char colorSelect = console.readChar();
										if (colorSelect == 'R'|| colorSelect == 'G'|| colorSelect == 'Y'|| colorSelect == 'B') 
										{
											validColor = true;
											hands.get(order).get(selection).setColor(colorSelect);
										} 
										else
											System.out.println("Choose valid color");
									}
								}
								
								lastPlayed = hands.get(order).remove(selection);
								
							}
						}
					}
			}
			
				
				
				
				
				
			}
			
			System.out.println("Player " + (order + 1) + " has " + hands.get(order).size() + " cards remaining" + "\n\n==================================================\n");
			// goes at end of while statement
			// Checks if player has won the game
			if (hands.get(order).size() == 0)
				gameWon = true;
			//checks if last played card was a reverse 
			if (trash.get(trash.size() - 1).getValue() == 'r') 
			{
				if (clockWise)
					clockWise = false;
				else
					clockWise = true;
			}
			
			if(!gameWon){
			if(clockWise)		
				order++;
			else 
				order--;
			if(order > 3)
				order = 0;
			if (order < 0)
				order = 3;
			}
			else
				System.out.print("Player " + (order + 1) + " has won.");
		}
		
		
	}
	
}