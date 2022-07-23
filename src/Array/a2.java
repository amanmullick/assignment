/*
 * A2. W.A.J.P to compute the average value of an array of integers except the largest and smallest values. 
 */
package Array;

public class a2 {
public static void main(String[] args) {
	int a[]= {1,88,3,4,5};
	int sum=0,avg=0;
	int max=a[0];
	int min=a[0];
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=1;i<a.length-1;i++)
	{
		//System.out.println(a[i]);
		sum=sum+a[i];
		avg=sum/(a.length-2);
	}
	System.out.println("sum = "+sum);
	System.out.println("average = "+avg);

}
}
