/*
 * I5. W.A.J.P to find the duplicate values of an array of integer values. 
 */
package Array;
import java.util.*;
public class i5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//int a[]= {1,1,2};
		int a[]=new int[5];
		System.out.println("enter array ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)	
			{
				if(a[i]==a[j])
				{	
					count++;
				System.out.println("DUPLICATE NUMBER FOUND");
				System.out.println("duplicate no = "+a[i]);
				}
				
			}}
			if(count==0)
			{
				System.out.println("DUPLICATE NOT FOUND ");
			}
			
		}
		
	}
