// Name: Jacob Rust
// Project: NumberChecker
 
import java.util.Arrays;

public class ArrayPracticeOne 
{
	public static void main(String[] args)
	{
		int numElements = 20, max;
		int[] data = new int[numElements];
		
		// Put random values from 1-100 in the array
		for(int i=0; i<numElements; i++)
		{
			data[i] = (int)(Math.random()*100+1);
		}
		
		// Display the unsorted array
		System.out.println("Unsorted:");
		for(int i=0; i<numElements; i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println();
		
		
		for(int a=0, b = numElements -1; a<numElements/2; a++, b--)
		{
			int temp2 = data[a];
			data[a] = data[b];
			data[b] = temp2;
		}
		
		// Display the now reversed array
		System.out.println("With elements reversed:");
		for(int i=0; i<numElements; i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println();
		
		//Finds the largest element
		max = data[0];
		for(int a=0; a<numElements; a++)
		{
			if(data[a] > max)
			{
				max = data[a];
			}	
		}
		System.out.println("The largest element is :" + max);
		
		//Finds the smallest element
		int small = data[0];
		for(int a=0; a<numElements; a++)
		{
			if(data[a] < small)
			{
				small = data[a];
			}	
		}
		System.out.println("The smallest element is :" + small);
		
		

		//Orders the array
		System.out.print("Order: ");
		for (int i = 0; i < data.length; i++)
		{
			   Arrays.sort(data);
		       System.out.print(data[i] + ", ");
		}
		System.out.println();
		
		
		
		
		
		
		for (int i = 0, b = 1; i < 19 ; i++,b++) 
		{                
			int temp = data[b];
		    data[b] = data[i];
		    data[i] = temp;
		    
		}

	
		
		
		System.out.print("With elements shifted:  ");
		for(int i=0; i<numElements; i++)
		{
			System.out.print( data[i]+" ");
		}
		
		
		
	}	
	

// calculates the mean
public static double computeMean(double data[])
{
	double sum = 0;
	for (int i = 0; i < data.length; i++)
	{
		sum = sum + data[i];
	}
	return sum/data.length;	
}

}

/*=====================================================Sample Output=========================================================*/

/*
 * Unsorted:
49 22 28 70 69 37 75 93 71 84 96 34 2 83 38 11 82 75 38 80 
With elements reversed:
80 38 75 82 11 38 83 2 34 96 84 71 93 75 37 69 70 28 22 49 
The largest element is :96
The smallest element is :2
Order: 2, 11, 22, 28, 34, 37, 38, 38, 49, 69, 70, 71, 75, 75, 80, 82, 83, 84, 93, 96, 
With elements shifted:  11 22 28 34 37 38 38 49 69 70 71 75 75 80 82 83 84 93 96 2 The Mean is 56.85
*/
