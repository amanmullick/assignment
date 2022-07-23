/*
 * A1. W.A.J.P to find the common elements between two arrays (string values). 
 */
package Array;

public class a1 {
public static void main(String[] args) {
	String s1[]= {"abc","def","gmhi"};
	String s2[]= {"xyz","abc","lmn"};
	int size=s1.length;
	System.out.println(size);
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<s2.length;j++)
		{
			if(s1[i].equals(s2[j])==true)
			{
				System.out.println("common found = "+s2[j]);
			}
		}
	}
}

}
