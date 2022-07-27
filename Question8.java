/*8) Write a program to reverse a given number and print

Example1)

I/P: 1234

O/P:4321

Example2)

I/P:1004

O/P:4001
*/

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		int i,j,rev=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number");
		 int num = sc.nextInt();
		 i = num;
		 while(i>0) {
			 j = i%10;
			 rev = rev*10 + j;
			 i = i/10;
		 }
		 System.out.println("The reverse of "+ num + " is "+ rev);
		 
		 
		 

	}

}
