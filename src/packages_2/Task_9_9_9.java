package packages_2;

import java.util.Scanner;

public class Task_9_9_9 {
//count of digits using do-while loop
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		do {
			n = n / 10;
			count++;
		} while (n != 0);
		System.out.println(count);
	}

}
