/*
 * I4. W.A.J.P to find the second most frequent character in a given string. 
 * The given string is: successes 
 * The second most frequent char in the string is: c 
 */
package string;

public class i4 {
	public static void main(String[] args) {
		String s="gibblegabbler";
		for(char ch='a';ch<='z';ch++)
		{
			int count=0;

			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}		
		if(count!=0)
		{
			System.out.println(ch +" = "+count);			
		}
	}
		
}}
