package packages_2;

public class Task_14_14_14 {
// count of even numbers using do-while loop 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=10,end=25;
		int count=0;
		do {
			if(start%2==0) {
				count++;
			}
			start++;
		}while(start<=end);
		System.out.println("The count of even numbers is : " +count);
	}

}
