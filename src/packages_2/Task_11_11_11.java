package packages_2;

import java.util.Scanner;

public class Task_11_11_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product = 1, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		n = sc.nextInt();

		do {
			int rem = n % 10;
			product = product * rem;
			n = n / 10;
		} while (n != 0);
		System.out.println(product);
	}

}
