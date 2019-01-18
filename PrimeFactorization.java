public class PrimeFactorization 
{
	public static void main(String[] args)
	{
		for(int n=2; n<=30; n++)
		{
			System.out.print(n + " Has a prime factorization of: ");
			PrimeFactor(n);
			System.out.println();
		}
	}
	
	
	public static void PrimeFactor(int number)
	{
		
		if(isPrime(number) == true)
		{
			System.out.print(number);
			return;
		}
		
		else
		{
			
			if(number%2 == 0)
			{
				
				PrimeFactor(number/2);
				System.out.print("*");
				PrimeFactor(2);
			}
			
			else
			{
				PrimeFactor(number/3);
				System.out.print("*");
				PrimeFactor(3);
			}
			
			
		}
		
		
	}
	
	public static boolean isPrime(int n)
	{
		if(n < 2)
		{
			return false;	
		}
		if( n == 2)
		{
			return true;
		}
		
		if (n % 2 == 0)
		{
			return false;
		}
		for(int i = 3; i*i<=n;i = i + 2)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}