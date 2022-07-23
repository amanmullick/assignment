/*B26. Write a Java program to count the letters, spaces, numbers and other characters of an input string.*/

package Fundamental;
import java.util.*;
public class b26 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		int letter=0, space=0,number=0,other=0;
		System.out.println("enter a string :");
		String s=sc.nextLine();
		int l=s.length();
		//ch=s.charAt(l-1);
		//System.out.println(ch);
		for(int i=0;i<l;i++)
		{
			ch=s.charAt(i);
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
			{
				letter++;
			}
			else if(ch==' ')
			{
				space++;
			}
			else if(ch>='0' && ch<='9') 
			{
				number++;
			}
			else
			{
				other++;
			}			
		}
		System.out.println("letters = "+ letter);
		System.out.println("space = "+ space);
		System.out.println("number = "+ number);
		System.out.println("other characters = "+ other);

	}
}
