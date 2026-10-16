package packages_2;

import java.util.Scanner;

public class Task_8_8_8 {
	// check positive /negative/zero using while loop
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, count = 3;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter the number : ");
			int num = sc.nextInt();
			if (num > 0) {
				System.out.println("+ve number is : " + num);
			} else if (num < 0) {
				System.out.println("-ve number is : " + num);
			} else {
				System.out.println("Given number is equals to zero");
			}
			i++;
		} while (i <= count);
		count++;

	}

}
