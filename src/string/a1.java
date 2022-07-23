/*
 * A1. W.A.J.P to find first non-repeating character in a string.
 *  The given string is: gibblegabbler 
 * The first non-repeated character in String is: i. 
 */
package string;

public class a1 {
public static void main(String[] args) {
	String s="gibblegabbler";
	int l=s.length();
	for(char ch=s.charAt(0);ch<=s.charAt(l-1);ch++)
	{	int freq=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
				freq++;
		}
		if(freq==1)
		{
			System.out.println("The first non-repeated character in String is : "+ch);
			break;
		}
	}
}
}
