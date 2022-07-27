/*9) Write a Java program to find if the given number is palindrome or not

Example1)

I/P: 110011

O/P: 110011 is a palindrome

Example2)

I/P: 1234

O/P: 1234 is not a palindrome*/

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		int i,j,pal=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number");
		 int num = sc.nextInt();
		 i = num;
		 while(i>0) {
			 j = i%10;
			 pal = pal*10 + j;
			 i = i/10;
		 }
		 if(num == pal) {
			System.out.println("It is a pallindrome");
			}
		 else {
			 System.out.println("It is not a pallindrome");
		 }
		 
		 
		 

	}

}
