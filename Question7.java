/*7) Write a program to print * in Floyds format (using for and while loop)

*

* *

* * *

Example1)

I/P: 3

O/P :

*

* *

* * **/

import java.util.Scanner;
public class Question7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of *");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
