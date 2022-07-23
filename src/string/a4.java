/*
 * A4. W.A.J.P to return a string where every appearance of the lowercase word 'is' has been replaced with 'is not'. The given string is: it is a string The new string is: it is not a string 
 */
package string;
	
public class a4 {
	public static void main(String[] args) {
		String s="aman is good ";
		String e="is";
		String n="is not";
		if(s.equals(e)==true)
		{
			s.replace(e,n);
			System.out.println(s);
		}
		else
		{
			System.out.println("no");
			System.out.println(s);
		}
	}
}
