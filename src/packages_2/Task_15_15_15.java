package packages_2;

public class Task_15_15_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 1, end = 24;
		int count = 0;
		do {
			if (start % 2 != 0) {
				count++;
			}
			start++;
		} while (start <= end);
		System.out.println("The count of odd number is : " + count);
	}

}
