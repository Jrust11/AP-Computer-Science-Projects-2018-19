
public class fibonacci 
{

	public static int itFib(int n)
	{
		if(n <= 2)
		{
			return 1;
		}
		
		int b2 = 1;
		
		int b1 = 1;
		
		int current = b1+ b2;
		
		for(int i = 2; i < n; i++)
		{
			b2=b1;
			b1=current;
			current = b1 + b2;
		}

		return current;
	}
	
	
	
	public static int recFib(int n)
	{
		if(n <= 2)
		{
			return 1;
		}
		
		return recFib(n-1) + recFib(n-2);
		
		
	}
	
	public static void main(String[] args)
	{
		
		
		int numTrials = 20;
		
		for(int i = 1; i <= numTrials ; i++)
		{
			System.out.println("Iterative("+i+")="+ itFib(i));
		}
		
		for(int i = 1; i <= numTrials ; i++)
		{
			System.out.println("Recursive("+i+")="+ recFib(i));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
