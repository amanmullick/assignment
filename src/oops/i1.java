/*
 * I1. Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1*2*3*. ... *(n-1) *n. E.g.- 4! = 1*2*3*4 = 24 3! = 3*2*1 = 6 2! = 2*1 = 2 Also, 1! = 1 0! = 0 
 */
package oops;
import java.util.*;

class f{
	void factorial()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		if(n==1)
		{
			System.out.println("factorial of 1 = 1");
		}
		else if(n==0)
		{
			System.out.println("factorial of 0 = 1");
		}
		else
		{
		System.out.println("factorial = "+fact);
	}}
}

public class i1 {
	public static void main(String[] args) {
		f ob =new f();
		ob.factorial();
	}

}
