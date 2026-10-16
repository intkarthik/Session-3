package packages_2;

public class Task_6_6_6 {
// sum of odd numbers using do-while loop
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, i = 1;
		do {
			if (i % 2 != 0) {
				sum = sum + i;
			}
			i++;
		} while (i <= 15);
		System.out.println("The sum of odd number is : " + sum);
	}

}
