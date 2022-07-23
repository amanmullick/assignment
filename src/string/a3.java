/*
 * A3. W.A.J.P to count and print all the duplicates in the input string. 
 * The given string is: w3resource tops technologies 
 * The duplicate characters and counts are: t appears 2 times o appears 3 times so on…………. 
 */
package string;

public class a3 {
public static void main(String[] args) {
	String s="aman";
	int l=s.length();
	for(char ch=s.charAt(0);ch<=s.charAt(l-1);ch++)
	{	int freq=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
				freq++;
				System.out.println("freq of "+ch +"="+freq);
			}
			}
		if(freq!=0)
		{
			System.out.println("freq of "+ch+" = "+freq);
			
		}
	}
}
}
