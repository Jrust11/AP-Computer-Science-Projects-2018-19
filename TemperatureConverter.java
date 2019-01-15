

import java.awt.*;
import BreezyGUI.*;

public class TemperatureConverter extends GBFrame 
{
   	//The labels: these display the text strings that guide the user.
 
   	private Label fahrenheitLabel; 
   	private Label celsiusLabel;
   	private Label kelvinLabel;
   	
   	//The integer fields: these are used for the input and output of 
   	//integer values.
  	private DoubleField fahrenheitField; 
   	private DoubleField celsiusField; 
   	private DoubleField kelvinField; 

   	//The command buttons: these trigger the buttonClicked method when
   	//clicked.

   	private Button convertButton;
   	
   	private Choice choices;
 	
 	
 	// A text area to output the answers.  You can put text into a TextArea 
 	// either by using area.setText(somestring) which replaces all of the text
 	// with the new text, or area.append(somestring) which adds the new string
 	// to the text already present in the text area
 	

   
   	public TemperatureConverter( )
   	{
   		fahrenheitLabel = addLabel("fahrenheit",1,1,1,1);
   		celsiusLabel = addLabel("celsius",2,1,1,1);
   		kelvinLabel = addLabel("kelvin",3,1,1,1);
   		
   		fahrenheitField = addDoubleField(0,1,2,1,1);
   		celsiusField = addDoubleField(0,2,2,1,1);
   		kelvinField = addDoubleField(0,3,2,1,1);
   		
   		convertButton = addButton("convert",4,1,1,1);
   		
   		choices = addChoice(4,2,1,1);
   		choices.add("fah to cel & kel");	// index 0
   		choices.add("cel to feh & kel");	// index 1
   		choices.add("kel to fah, cel");		// index 2
   		
   	}

   

   	public void buttonClicked (Button buttonObj)
   	{
   			int ch = choices.getSelectedIndex();
   			
      		if(buttonObj == convertButton)
      		{
      			
      		}
    }
    
    public static void main (String[] args)
	{
		//Instantiate the GUI part
		Frame frm = new TemperatureConverter();    
		//Set the application's window width and height in pixels
		frm.setSize (550, 400);  
		//Make the window visible to the user
		frm.setVisible (true);           
	}
      	
 }
