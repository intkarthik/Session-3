package packages_2;

public class Task_13_13_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev = 0, n = 900;
		int og_val = n;
		do {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		} while (n != 0);

		if (og_val == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}

}
