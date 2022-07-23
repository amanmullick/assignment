
//B20. Write a program in Java to input 5 numbers from keyboard and find their sum and average using for loop.
package Fundamental;
import java.util.*;
public class b20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		
		int sum=a+b+c+d+e;
		double avg=(double)sum/5;
		System.out.println("sum = "+sum);
		System.out.println("average = "+avg);

	}
}
