// Name: Jacob Rust
// Project: Array Practice 1
 
import java.awt.*;

//Breezy GUI is an interface package we use for our Comp Sci class
//Breezy GUI package will be a package in the master branch
import BreezyGUI.*;


public class ArrayPractice1
{
	
  //Main method
	public static void main(String[]args)
	{
		double[] data = new double[10];
		
    //Assigns random doubles to the 10 positions in the array
		for(int i = 0; i<data.length; i++)
		{
			data[i] = Math.random();
		}
		
		double sum = 0;
		
    //calculates the sum
		for( int i = 0; i<data.length; i++)
		{
			sum = sum + data[i];
		}
		
		//calculates the mean
		System.out.println("Mean = " + sum/data.length);
	
	}
	
	
}
