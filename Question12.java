/*2)Write a program to initialize an integer array and find the maximum and minimum value of the array.*/
import java.util.Scanner;
public class Question12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int min=1, max=1;
		System.out.println("Enter no of elements:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>max) {
				max = arr[j];
				}
			}
		for(int k=0;k<arr.length;k++) {
			if(arr[k]<min) {
				min = arr[k];
				}
			}
		
		System.out.println("Min and Max values of the elements of array is: " + min +" " + max);


	}

}
