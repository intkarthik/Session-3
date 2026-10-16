package packages_2;

import java.util.Scanner;

public class Task_10_10_10 {
//sum of digits using do-while loop
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		n = sc.nextInt();

		do {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		} while (n != 0);
		System.out.println(sum);
	}

}
