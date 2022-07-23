/*
 *  A2. W.A.J.P to divide a string in an equal part. 
 *  The given string is: abcdefghijklmnopqrstuvwxy 
 *  The string divided into 5 parts and they are: 
 	abcde 
 	fghij 
 	klmno 
 	pqrst 
 	uvwxy 
 */
package string;

public class a2 {
	public static void main(String[] args) {
		String s="abcdefghijklmnopqrstuvwxy";
		int l=s.length();
		System.out.println(s.substring(1,5));
		for(char ch=s.charAt(0);ch<=s.charAt(l-1);ch++)
		{
			
			System.out.println(s.substring(0,5));
		}
	}
}
