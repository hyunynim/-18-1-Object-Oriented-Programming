import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
			System.out.print("Enter an integer between 0 and 1000: ");
			int num = input.nextInt();
			int num_tmp = num;
			int ans = 1;
			ans *= num%10;
			num /= 10;
			if(num != 0) {
			ans *= num%10;
			num /= 10;
			}
			if(num != 0) {
				ans *= num%10;
				num /= 10;
			}
			if(num != 0) {
				ans *= num%10;
				num /= 10;
			}
			System.out.println("The multiplication of all digits in " + num_tmp +  " is " + ans);


	}

}
