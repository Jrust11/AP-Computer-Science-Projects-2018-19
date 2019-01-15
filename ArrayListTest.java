import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest
{
	public static void main(String[] args)
	{
		int numElements = 10;
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		// Put random values from 1-100 in the array
		for(int i=0; i<numElements; i++)
		{
			data.add((int)(Math.random()*100+1));
		}
		
		// Display the unsorted ArrayList
		System.out.println("Unsorted:");
		for(int i=0; i<numElements; i++)
		{
			System.out.print(data.get(i)+" ");
		}
		System.out.println();
		
		
		
		Integer t9 = data.remove(9);
		Integer t8 = data.remove(8);
		Integer t7 = data.remove(7);
		Integer t6 = data.remove(6);
		Integer t5 = data.remove(5);
		Integer t4 = data.remove(4);
		Integer t3 = data.remove(3);
		Integer t2 = data.remove(2);
		Integer t1 = data.remove(1);
		
		data.add(0,t9);
		data.add(1,t8);
		data.add(2,t7);
		data.add(3,t6);
		data.add(4,t5);
		data.add(5,t4);
		data.add(6,t3);
		data.add(7,t2);
		data.add(8,t1);
		// Display the now reversed ArrayList
		System.out.println("With elements reversed:");
		for(int i=0; i<numElements; i++)
		{
			System.out.print(data.get(i)+" ");
		}
		System.out.println();
		
		
		int max = data.get(0);
		for(int a=0; a<numElements; a++)
		{
			if(data.get(a) > max)
			{
				max = data.get(a);
			}	
			
		}
		
		System.out.println("Greatest Integer: " + ""+max+"");
		
		int min = data.get(0);
		for(int a=0; a<numElements; a++)
		{
			if(data.get(a) < min)
			{
				min = data.get(a);
			}	
			
		}
		
		System.out.println("Smallest Integer: " + ""+min+"");
		
		
		/*
		 * Put code here to sort the ArrayList into least to greatest order
		 */
		
		
		

		
		
		
		
		/* Display the now sorted ArrayList
		System.out.println("Sorted least to greatest:");
		for(int i=0; i<numElements; i++)
		{
			System.out.print(data.get(i)+" ");
		}
		System.out.println();*/
		
		
		
		
	}
}