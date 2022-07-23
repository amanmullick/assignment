
/*
 * B14. W.A.J.P to test if an array contains a specific value. 
 */
package Array;
import java.util.*;
public class b14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int flag=0;
		System.out.print("enter how many elements u want : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("enter "+(i+1)+" element = ");
			a[i]=sc.nextInt();
		}
		System.out.print("enter the value to be checked : ");
		int val=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			if(a[i]==val)
			{
				flag=flag+1;
				System.out.println("f="+flag);
				System.out.println(a[i]);
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
