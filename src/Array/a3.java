/*
 *  A3. W.A.J.P to check if the sum of all the 10's in the array is exactly 30. Return false if the condition does not satisfy, otherwise true. 
 */
package Array;

public class a3 {
public static void main(String[] args) {
	int a[]= {1,25,10,150,10,10};
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==10)
		{
			sum=sum+a[i];
		}
	}
	if(sum==30)
	{
		System.out.println(" CONDITION IS TRUE \n sum = "+sum);
	}
	else
	{
		System.out.println("CONDITION IS FALSE ");
	}
}
}
