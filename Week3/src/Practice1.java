import java.util.Scanner;


public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the number of lines: ");
		int line = input.nextInt();
		for(int j = 1; j<=line; j++) {
		for(int i = (line-j)*3; i >= 0; i--) {
			System.out.printf(" ");
		}
		for(int i = j; i>=1; i--) 
			System.out.printf("%3d", i);
	
		for(int i = 2; i<=j; i++)
			System.out.printf("%3d", i);
		System.out.println("");
	}
	}
}
