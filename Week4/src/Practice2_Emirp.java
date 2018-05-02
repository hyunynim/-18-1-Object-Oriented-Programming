import java.util.Scanner;

public class Practice2_Emirp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.printf("한줄에 몇개? ");
		int numberOfLine = input.nextInt();

		System.out.printf("총 몇개? ");
		int totalCnt = input.nextInt();
		PrintEmirp(numberOfLine, totalCnt);
	}
	
	public static boolean isEmirp(int number)
	{
		//리버스도 소수이고, 회문이 아니여야함
		if(Practice1_Palindrome.isPalindrome(number) == false && isPrime(number) && isPrime(Practice1_Palindrome.reverse(number)))
			return true;
		else 
			return false;
	}
	
	public static boolean isPrime(int number)
	{
		if(number %2 == 0) {
			return false;
		}
		else {
			for(int div = 3; div <= (int)Math.sqrt((double)number); div += 2)
				if(number % div == 0)
					return false;
			}
		return true;
	}
	
	public static void PrintEmirp(int numberOfLine, int totalCnt) {
		int cnt = 0;
		int chkNum = 2;
		while(cnt != totalCnt) {
			if(isEmirp(chkNum)) {
				System.out.printf("%d ",  chkNum);
				cnt++;
				if(cnt % numberOfLine == 0)
					System.out.println();
			}
			chkNum++;
		}
	}

}
