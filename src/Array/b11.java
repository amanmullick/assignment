/*
 * B11. W.A.J.P to sort a numeric array and a string array. 
 */
package Array;
import java.util.*;
public class b11 {
	
	public void num()
	{
		int a[]={1,2,3,4,5};
		int len=a.length;
		for(int i=0;i<len-1;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				int temp=0;
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			}}
		}
		System.out.println("sorted numeric array ");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}

	}
	
	public void str() {
		String s[]= {"cbc","bvc","cde"};
		int size=s.length;
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(s[i].compareTo(s[j])>0)
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.println("sorted = "+ Arrays.toString(s));
	}

	public static void main(String[] args) {
			b11 ob=new b11();
			ob.num();
			ob.str();
			
	}
}
