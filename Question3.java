/*3) Write a program to check if a given number is prime or not.*/

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		boolean flag = false;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number");
		 int num = sc.nextInt();
		    for (int i = 2; i <= num/2; i++) {
		    
		        if (num % i == 0) {
		          flag = true;
		          break;
		        }
		      }
		if (flag == true) {
			System.out.println("It is not Prime");
		}
		else {
			System.out.println("It is Prime");
		}
	}

}
