package packages_2;

public class Task_17_17_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int n = 7658;
		do {
			int rem = n % 10;
			if (rem > max) {
				max = rem;
			}
			n = n / 10;
		} while (n != 0);
		System.out.println("The largest number is : " + max);
	}

}
