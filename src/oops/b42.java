/*
 * B42. Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by user. 
 */
package oops;
import java.util.*;
class complex{
	int a,b;
	int x,y;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first complex number ");
		System.out.print("real = ");
		a=sc.nextInt();
		System.out.print("imaginary = ");
		b=sc.nextInt();
		
		System.out.println("enter the second complex number ");
		System.out.print("real = ");
		x=sc.nextInt();
		System.out.print("imaginary = ");
		y=sc.nextInt();
		
		System.out.println("first complex number : "+a+" + "+b+"i ");
		System.out.println("second complex number : "+x+" + "+y+"i ");
		
	}
	void sum()
	{
		System.out.println("sum = "+(a+x)+" + "+(b+y)+"i ");
	}
	void diff()
	{
		System.out.println("difference = "+(a-x)+" + "+(b-y)+"i ");

	}
	void prod()
	{
		System.out.println("product = "+(a*x)+" + "+(b*y)+"i ");

	}
}
public class b42 {
	public static void main(String[] args) {
		complex ob=new complex();
		ob.input();
		ob.sum();
		ob.diff();
		ob.prod();
	}
}
