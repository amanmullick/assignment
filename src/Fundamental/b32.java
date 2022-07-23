
/*
 * B32.Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers. 
 * Input the first number: 35 
 * Input the second number: 45 
 * Result: true
 */
package Fundamental;
import java.util.*;
public class b32 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int t=0,f=0;
			System.out.print("enter first number between 25 and 75 : ");
			int n=sc.nextInt();
			
			System.out.print("enter second number between 25 and 75 : ");
			int m=sc.nextInt();
	if((n>=25 && n<=75) && (m>=25 && m<=75))	
	{
		while(n>0 && m>0)
		{
			int rem1=n%10;
			n=n/10;
			int rem2=m%10;
			m=m/10;
			System.out.println(rem1);
			System.out.println(rem2);
			if(rem1==rem2 )
			{
				t=1;
			}
			else
			{
				f=1;
			}
		}
		if(t==1)
		{
			System.out.println("Result : true");
		}
		else if(f==1)
		{
			System.out.println("Result : false");	
		}
	}
	else
	{
		System.err.println("ERROR !! Please numbers between 25 and 75 ");
	}
}
}