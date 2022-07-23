/*
 * I1. W.A.J.P to remove a specific element from an array 
 */

package Array;
import java.util.*;
public class i1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int ele;
		int count=0;
		System.out.print("enter the size of array : ");
		 n=sc.nextInt();
		 int a[]=new int[n];
		 System.out.println("enter the array elements ");
		 for(int i=0;i<n;i++)
		 {
			 a[i]=sc.nextInt();
		 }

			System.out.println("enter the element to be deleted : ");
			ele=sc.nextInt();
	
			for(int i=0;i<n;i++)
			{
				if(ele==a[i])
				{
					for(int j=i+1;j<n;j++)
					{
					a[i]=a[i+1];
					count++;
					}
			}
		}
			if(count==0)
			{
				System.out.println("element not found ");
			}
			else
			{
				System.out.println("element deleted ");
			for(int i=0;i<n-1;i++)
			{
				System.out.println(a[i]);
			}
	}
}}
