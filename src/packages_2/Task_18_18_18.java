package packages_2;

public class Task_18_18_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 5;
		int exp = 3;
		int pow = 1;
		int i = 1;

		do {
			pow = pow * base;
			i++;
		} while (i <= exp);
		System.out.println(pow);
	}

}
