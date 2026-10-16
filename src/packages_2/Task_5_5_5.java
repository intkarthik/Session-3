package packages_2;

public class Task_5_5_5 {
// sum of even numbers using do while loop
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, i = 1;
		do {
			if (i % 2 == 0) {
				sum = sum + i;
			}
			i++;
		} while (i <= 10);
		System.out.println(sum);
	}

}
