import java.util.ArrayList;

public class StringManipulator 
{
	public static void main(String[] args)
	{
		String q = "sample";
		String w = "This is pretty cool";
		String e = "elephant";
		String r = "fireplace";
		
		
		
		System.out.println(removeVowels(q));
		System.out.println(removeVowels(w));
		System.out.println(scrambleWord(e));
		System.out.println(scrambleWord(r));
	}
	
	//  precondition:
	// postcondition: returns a new String which contains only 
	//    all of the characters in the original except the vowels
	//    (EX: sample is returned as smpl)
	
	public static String removeVowels(String str)
	{	
		str = str.replaceAll("a", "");
		str = str.replaceAll("e", "");
		str = str.replaceAll("i", "");
		str = str.replaceAll("o", "");
		str = str.replaceAll("u", "");
		
		return str;
	}
	
	//  precondition: word is a single word
	// postcondition: returns a new string which is has the same
	//   first and last character as word and the rest of the 
	//   characters have been scrambled randomly
	//   (EX: sample could be returned as smpale or splame)
	public static String scrambleWord(String word)
	{
		if(word.length() == 2)
		{
			return word;
		}
		
		String temp =  new String();
		//String temp1 =  new String();
		//temp1 = temp1 + word.charAt(word.length()-1);
		temp = temp + word.charAt(0);
		
		
		ArrayList<Character> list = new ArrayList<Character>();
		
		for(int i = 1; i < word.length();i++)
		{
			list.add(word.charAt(i));
			temp = temp + word.charAt(word.length()-i);
			while(list.size()>0)
			{
				int index = (int)(Math.random()*list.size());
				temp = temp + list.remove(index);
			}
		}
		return temp; //+ temp1;
	
		
		
		
	}
	
	
}