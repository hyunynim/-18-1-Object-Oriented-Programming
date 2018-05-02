import java.util.Scanner;

public class Practice1_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Is palindrome? :");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(isPalindrome(num))
			System.out.printf("Palindrome!");
		else
			System.out.printf("Not palindrome!");
		
		
	}
	
	public static int reverse(int number) {
		int reverseAnswer = 0;
		while(number != 0) {
			reverseAnswer = reverseAnswer*10 + number%10;
			number /= 10;
		}
		return reverseAnswer;
	}

	public static boolean isPalindrome(int number)
	{
		return (number == reverse(number)) ? true : false;
	}
}
