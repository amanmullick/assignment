
/*
 * B33.Write a Java program to compute the sum of the first 100 prime numbers. 
 */
package Fundamental;

public class b33 {
	public static void main(String[] args) {
		int flag=0,sum=0;
		for(int i=1;i<=100;i++)
		{
		for(int j=2;j<=(i-1);j++)
		{
			if(i%j==0)
			{
				flag=1;
			}
		}
		if(flag!=1)
		{
		System.out.println("prime no = "+i);
		sum=sum+i;
		}
		else
			flag=0;
	
	}
		System.out.println("sum="+sum);
}
}
