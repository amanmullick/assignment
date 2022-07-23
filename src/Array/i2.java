/*
 * I2. W.A.J.P to copy an array by iterating the array. 
 */
package Array;
import java.util.*;
public class i2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		int b[]=new int[3];
		System.out.println("enter array of 3 elements :");
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
				b[i]=a[i];
		}
		System.out.println("copied array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(b[i]);
		}
	}
}
