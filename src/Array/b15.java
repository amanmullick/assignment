/*
 * B15. W.A.J.P to find the index of an array element. 
 */
package Array;
import java.util.*;
public class b15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]=new int[3];
		System.out.println("enter 3 elements");
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter no :");
		int no=sc.nextInt();
		for(int i=0;i<3;i++)
		{
			if(no==a[i])
			{
				System.out.println("array index = "+i);
			}
		}
	}
}
