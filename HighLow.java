// Name: Jacob Rust
// Project: Simple Game Project - High Low

import java.awt.*; import BreezyGUI.*;

public class HighLow extends GBFrame {
// Instance Variables (the window components)
	
	private Label guessLabel;
	
	private Label computerLabel2; 
	
	private Label game1Label;
	
	private Label game2Label;
	
	private Label giveupLabel;
	
	private IntegerField computerField2; 
	
	private IntegerField guessField; 
	
	private IntegerField giveupField;
	
	private Button checkButton;
	
	private Button giveupButton;
	
	private Button toohighButton; 
	
	private Button toolowButton;
	
	private Button startButton;
	
	private static TextArea outputArea; 
	
	private TextArea primeArea;
	
public HighLow() 
{
	// creates the interface for the game
	
	guessLabel = addLabel("Your Guess",7,1,1,1); 
	
	guessField = addIntegerField(0,8,2,1,1); 
	
	checkButton = addButton("Check",5,1,1,1); 
	
	outputArea = addTextArea("",9,1,5,3); 
	
	giveupButton = addButton("Give Up",5,2,1,1); 
	
	toohighButton = addButton("Too High",3,2,1,1);   
	
	toolowButton = addButton("Too Low",3,3,1,1);
	
	startButton = addButton("Start",3,1,1,1);
	
	game1Label = addLabel("Computer guesses your #",2,1,1,1); 
	
	game2Label = addLabel("You guess the #",4,1,1,1);
}

	// assigns variables and random will be the number the comp. wants you to guess
	
	int random = (int)(Math.random()*100+1); 
	
	int upper = 100;
	
	int lower = 1;
	
	int start = 50;
	
public void buttonClicked(Button buttonObj) 
{
	// guess the computers #
	if(buttonObj == checkButton) 
	{
		
		int n = guessField.getNumber(); if(n > random)
		{
			
			outputArea.append("Too High: " + n + "\n"); 
			
		}
		
		else if(n < random) 
		{
			
			outputArea.append("Too Low: " + n + "\n"); 
			
		}
		
		else if( n == random) 
		{
			
			outputArea.append("Congrats!! The Correct answer was " + ""+random+"" + "\n");
			
		} 
		
	}
	
	if(buttonObj == giveupButton) 
	{
		// wow. we need a give up button.
		
		outputArea.append("The correct answer is " + ""+random+"" + "\n");
		
	}
	
	// computer guesses your number in 6/7 tries
	if(buttonObj == toohighButton) 
	{
		
		upper = start;
		
		start = ((upper - lower)/2) + lower;
		
		outputArea.append("Is it " + ""+start+"" + "?" + "\n"); 
		
	}
	
	
	if(buttonObj == toolowButton) 
	{
		
		lower = start;
		
		start = ((upper - lower)/2) + lower; 	
		
		outputArea.append("Is it " + ""+start+"" + "?" + "\n");
		
	}
	
	
	if(buttonObj == startButton) 
	{
		//Starts at 50 and removes half of what you don't need
		// ex. if my # is 5 the comp will guess 50 
		// then, I say it is too high. That means all #'s greater than 50 can be removed and the new range is from 1-50
		outputArea.append("Is it " + ""+start+"" + "?" + "\n"); 
		
	}
		
}

	// Main
	public static void main(String[] args) 
	{
		// creates the game frame
		HighLow frm = new HighLow(); frm.setSize(325,400); frm.setVisible(true);
	
	}
	
	
}
