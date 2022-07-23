
/*
 * B31. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer. 
 * Input the first number: 5 
 * Input the second number: 10 
 * Input the third number: 15 
 * The result is: true
 */
package Fundamental;
import java.util.*;
public class b31 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
			int sum=0;
		System.out.print("enter first number :");
		int a=sc.nextInt();
		System.out.print("enter second number : ");
		int b=sc.nextInt();	
		sum=a+b;
		System.out.print("enter third number : ");
		int c=sc.nextInt();
		if(sum==c)
		{
			System.out.println("The result is : true");
		}
		else {
			System.out.println("The result is : false");
		}
		
	}
}
