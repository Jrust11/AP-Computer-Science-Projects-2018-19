/*
 Class: Simple Game Project - Hi-Lo
 Author: Jacob Rust
 Date: October 11, 2018
 */




import java.awt.*;

import BreezyGUI.*;

public class highlow extends GBFrame 
{
	// Instance Variables (the window components)
	private Label guessLabel;
	private Label computerLabel2;
	private IntegerField computerField2;
	private IntegerField guessField;
	private Button checkButton;
	private static TextArea outputArea;
	private TextArea primeArea;
	private Button giveupButton;
	private IntegerField giveupField;
	private Label giveupLabel;
	private Button toohighButton;
	private Button toolowButton;
	private Button startButton;
	private Label game1Label;
	private Label game2Label;

	
	public highlow()
	{
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
	
    int random = (int)(Math.random()*100+1);
    int upper = 100;
    int lower = 1;
    int start = 50;
    
	
	public void buttonClicked(Button buttonObj)
	{
		if(buttonObj == checkButton)
		{
			int n = guessField.getNumber();
			if(n > random)
			{
				outputArea.append("Too High: " +  n + "\n");
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
			outputArea.append("The correct answer is " + ""+random+"" + "\n");
		}
				
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
			outputArea.append("Is it " + ""+start+"" + "?" + "\n");
		}
		
	}			

	
	public static void main(String[] args)
	{
		highlow frm = new highlow();
		frm.setSize(325,400);
		frm.setVisible(true);
	}
}

