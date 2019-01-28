// Name: Jacob Rust
// Project: Method Test


public class RecursiveGuess 
{
	public static void main(String[] args)
	{
		
		System.out.println(myMethod(5,15));
	}


	//  precondition: x, y are both ³ 0,
	// postcondition:
	public static int myMethod(int x, int y)
	{
		if(y==0)
			return x;
		else
			return myMethod (y, x%y);
	}
}


// This program finds the greatest common factor between x and y
//
// System.out.println(myMethod(5,15)) = 5
//
// System.out.println(myMethod(4,12)) = 4