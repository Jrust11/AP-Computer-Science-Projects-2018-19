import java.util.ArrayList;

public class MoreArrayListPractice1 
{
	public static void main(String[] args)
	{
		// Task 1
		int numElements = 10;
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		// Put random values from 1-100 in the array
		for(int i=0; i<numElements; i++)
		{
			data.add((int)(Math.random()*101-50));
		}
		
		// Display the unsorted ArrayList
		System.out.print("Original:\t");
		for(int i=0; i<numElements; i++)
		{
			System.out.print(data.get(i)+"\t");
		}
		System.out.println();
		
		// PUT CODE HERE TO USE THE getAllNegatives METHOD TO GET AN 
		// ARRAYLIST OF ALL THE NEGATIVE VALUES IN data AND DISPLAY 
		// THIS NEW ARRAYLIST
		
		
		// Task 2
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0; i<numElements; i++)
		{
			char ch1 = (char)(Math.random()*25+65);
			char ch2 = (char)(Math.random()*25+65);
			char ch3 = (char)(Math.random()*25+65);
			String temp = ""+ch1+ch2+ch2;
			list.add(temp);
		}
		
		System.out.print("Original:\t");
		for(int i=0; i<list.size(); i++)
		{
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
		
		// PUT CODE HERE TO USE THE containsVowles METHOD TO GET AN 
		// ARRAYLIST OF ALL THE ELEMENTS IN list THAT CONTAIN AT LEAST
		// ONE VOWEL AND DISPLAY THIS NEW ARRAYLIST
	}
	
	
	//  precondition:
	// postcondition: returns and ArrayList<Integer> of all the elements in
	//    original that are negative numbers
	public static ArrayList<Integer> getAllNegatives(ArrayList<Integer> original)
	{
		return original;
		// put code here to make this method work as specified
	}
	
	//  precondition: 
	// postcondition: returns a new ArrayList containing all of the Strings 
	//     in original ArrayList that contain a vowel
	public static ArrayList<String> containsVowel(ArrayList<String> original)
	{
		return original;
		// put code here to make this method work as specified
	}
}