
/*
 * B28. Write a Java program that accepts an integer (n) and computes the value of
 *  n+nn+nnn.
 *   Input number: 5
 *    5 + 55 + 555 
 */
package Fundamental;
import java.util.*;
public class b28 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int sum=0;
	System.out.print("enter a number : ");
	int n=sc.nextInt();
	sum=n+(n*n)+(n*n*n);
	System.out.println("n+nn+nnn = "+ sum);
}
}
