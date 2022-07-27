/*1)Write a program to initialize an integer array and print the sum and average of the array.*/

import java.util.Scanner;
public class Question11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		float avg=0.0f;
		System.out.println("Enter no of elements:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++) {
			sum = sum + arr[j];
		}
		avg = sum/2;
		System.out.println("Sum & Avg of the elements of array is: " + sum +" "+ avg);


	}

}
