/*4) Initialize an integer array with ascii values and print the corresponding character values in a single row.*/

import java.util.Scanner;
public class Question14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of elements:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			char Value = (char)arr[i];
			System.out.print(Value+" ");
		}


	}

}
