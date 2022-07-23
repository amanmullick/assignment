/*
 * I1. W.A.J.P to check whether a given string ends with the contents of another string.
 *  "Java Exercises" ends with "se"? false 
 *  "Java Exercise" ends with "se"? true 
 */
package string;

public class i1 {
	public static void main(String[] args) {
		String s1="Java Exercises";
		String s2="Java Exercise";
		String end="se";
		
		if(s1.endsWith(end)==true)
			System.out.println("true");
		else
			System.out.println("false");
		
	}
}
