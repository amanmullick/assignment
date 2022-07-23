
//B18. Write a Java program that takes a year from user and print whether that year is a leap year or not. 

package Fundamental;
import java.util.*;
public class b18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a year : ");
		int n=sc.nextInt();
		
		if(n%4==0 && n%100!=0)
		{
			System.out.println("leap year");
		}
		else if(n%400==0 )
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
	}
}
