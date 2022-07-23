
//B16. W.A.J.P to Take three numbers from the user and print the greatest number. 

package Fundamental;

import java.util.Scanner;

public class b16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter three numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is greatest");
		}
		else if(b>c)
		{
			System.out.println("b is greatest");
		}
		else
		{
			System.out.println("c is greatest");
		}
	}
}
