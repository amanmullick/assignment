/*
 * I7. W.A.J.P to find the second largest element in an array. 
 */
package Array;

public class i7 {
	public static void main(String[] args) {
		int a[]= {52,2,3,4,10,8};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[i])
				{
					int temp=0;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}

		System.out.println("second max = "+a[a.length-2]);
	
}
}