/*
 * A4. W.A.J.P to segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s. 
 * Original Array: [0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1] 
 * Array after segregation is: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1] 
 */
package Array;

public class a4 {
	public static void main(String[] args) {
		int a[]= {0,1,0,1,1,0,1,1,0,0,1};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
		}}
		System.out.println("after ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  " );
		}
	}

}

