// Name: Jacob Rust
// Project: String Sorter


import java.util.ArrayList;

public class SortingStrings 
{
	public static void main(String[] args)
	{
		ArrayList<String> str = new ArrayList<String>();
		int numElements = 10;
		
		for(int i=0; i<numElements; i++)
		{
			char ch1 = (char)(Math.random()*25+65);
			char ch2 = (char)(Math.random()*25+65);
			String temp = ""+ch1+ch2;
			str.add(temp);
		}
		
		System.out.print("Unsorted: ");
		for(int i=0; i<str.size(); i++)
		{
			System.out.print(str.get(i)+"\t");
		}
		System.out.println();
		
		for(int a = 0; a < str.size(); a++)
		{
			
			for(int b = a+1; b < str.size(); b++)
			{
				if(str.get(a).compareTo(str.get(b)) < 0)
				{
					String temp = str.remove(a);
					
					str.add(b,temp);
				}
					
				if(str.get(a).compareTo(str.get(b)) > 0)
				{
					
					String temp = str.remove(b);
					
					str.add(a,temp);
					
				}
			}
	
		}
		
		System.out.print("  Sorted: ");
		for(int i=0; i<str.size(); i++)
		{
			System.out.print(str.get(i)+"\t");
		}
		System.out.println();
		
	}
	
}

