package packages_2;

public class Task_12_12_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev = 0, n = 789;
		do {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		} while (n != 0);
		System.out.println("The reverse number is :"+rev);
	}

}
