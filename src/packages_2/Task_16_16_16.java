package packages_2;

public class Task_16_16_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 789;
		int max = Integer.MAX_VALUE;
		do {
			int rem = n % 10;
			if (rem < max) {
				max = rem;
			}
			n = n / 10;
		} while (n != 0);
		System.out.println(max);
	}

}
