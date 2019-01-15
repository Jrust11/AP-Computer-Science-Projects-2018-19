import java.awt.*;
import BreezyGUI.*;

public class NumberChecker extends GBFrame 
{
	// Instance Variables (the window components)
	private Label inputFieldLabel;
	private IntegerField inputField;
	private Button isPrimeButton;
	private TextArea outputArea;
	
	public NumberChecker()
	{
		inputFieldLabel = addLabel("Number to Check",1,1,1,1);
		inputField = addIntegerField(0,1,2,1,1);
		isPrimeButton = addButton("Is Prime?",2,1,1,1);
		outputArea = addTextArea("",3,1,3,3);
	}
	
	public void buttonClicked(Button buttonObj)
	{
		if(buttonObj == isPrimeButton)
		{
			int number = inputField.getNumber();
			outputArea.append(number + "\n");
		}
	}
	
	public boolean isPrime(int n)
	{
		// put code here to make the method work
		return true;
	}
	
	public static void main(String[] args)
	{
		NumberChecker frm = new NumberChecker();
		frm.setSize(350,350);
		frm.setVisible(true);
	}
}
