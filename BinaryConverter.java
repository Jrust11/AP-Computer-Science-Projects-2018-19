// Name: Jacob
// Project: Binary Converter
// Date: 1/17/19


public class BinaryConverter 
{
	public static void main(String[] args)
	{
		for(int n=1; n<=16; n++)
		{
			System.out.print(n + " --> ");
			toBinary(n);
			System.out.println();
		}
	}
	
	/**
	* This method works recursively to print out the 
	* binary equivalent to the positive decimal integer
	* inBase10. You are to complete the method so that
	* it works as specified.
	* @param the decimal integer to be converted to binary
	*/
	public static void toBinary(int inBase10)
	{
	        if(inBase10 <= 1)
	        {
	                System.out.print(inBase10);
	           
	        }
	        else
	        {
	        	toBinary(inBase10/2);	
	        	toBinary(inBase10%2);
	        
	        }
	}
	
}