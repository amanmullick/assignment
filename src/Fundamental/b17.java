
//B17. Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between an and z or A and Z), or is a string of length > 1, print an error message. 
package Fundamental;
import java.util.*;
public class b17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character : ");
			char ch=sc.next().charAt(0);
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
			{
				if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u') || (ch=='A') || (ch=='E') || (ch=='I') || (ch=='O') || (ch=='U'))
				{
					System.out.println("it is a vowel");
				}
				else {
					System.out.println("its consonent");
				}
			}
			else
			{
				System.out.println("enter an alphabet ");
			}
}
}
