
/*
 * B34. Write a Java program that accepts two double variables and
 *  test if both strictly between 0 and 1
 *   and false otherwise. 
 *   Input first number: 5
 *    Input second number: 1 
 *    false 
 */
package Fundamental;
import java.util.*;
public class b34 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.print("enter first number : ");
		double a=sc.nextDouble();
		System.out.print("enter second number : ");
		double b=sc.nextDouble();
		if((a>0 && a<1) && (b>0 && b<1))
		{
			System.out.println("TEST : TRUE ");
		}
		else
		{
			System.out.println("TEST : FALSE ");
		}
		
	}
}
