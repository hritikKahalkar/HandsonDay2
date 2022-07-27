/*6) Write a program to print the sum of all the digits of a given number.

Example1)

I/P:1234

O/P:10
*/

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		int i,j,sum=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number");
		 int num = sc.nextInt();
		 i = num;
		 while(i>0) {
			 j = i%10;
			 sum = sum + j;
			 i = i/10;
		 }
		 System.out.println("The sum of digits of "+ num + " is "+ sum);
		 
		 
		 

	}

}
