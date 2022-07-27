/*Write a program to reverse order of array elements*/

import java.util.Scanner;
public class Question5 {


	public static void main(String[] args)
	{


		int arr[] = { 4, 3, 2, 1 };


		for (int i = 0; i < arr.length; i++) {


			for (int j = i + 1; j < arr.length; j++) {


				int temp = 0;
				if (arr[j] < arr[i]) {


					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print(arr[0] + " " +arr[1] + " "+arr[3] + " "+arr[2]);

	}
}
