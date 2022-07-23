/*
 * I4. W.A.J.P to reverse an array of integer values. 
 */
package Array;
import java.util.*;
public class i4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		System.out.println("enter 3 values : ");
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("reverse ");
		for(int i=3-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}
