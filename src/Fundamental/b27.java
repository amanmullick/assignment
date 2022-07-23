
/*
 * B27. Write a Java program to print the ascii value of a given character. 
 */
package Fundamental;
import java.util.*;
public class b27 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
		System.out.print("enter a character : ");
		char ch=sc.next().charAt(0);
		int ascii=(int)ch;
		System.out.println(ascii);
}
}
