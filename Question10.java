/*10) Write a program to print first 5 values which are divisible by 2, 3, and 5.
*/

public class Question10 {

	public static void main(String[] args) {
		int flag = 0;
		for(int i=1; flag<=5; i++) {
			if(i%2==0 && i%3==0 && i%5==0) {
				System.out.println(i);
				flag++;
			}
		}

	}

}
