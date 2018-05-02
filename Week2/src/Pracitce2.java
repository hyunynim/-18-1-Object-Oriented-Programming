import java.util.Scanner;

public class Pracitce2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	System.out.println("Practice 2");

	int[] lotto_num = new int[3];
	lotto_num[0] = (int)((System.currentTimeMillis() / 16) % 10);
	lotto_num[1] = (int)((System.currentTimeMillis() / 17) % 10);
	lotto_num[2] = (int)((System.currentTimeMillis() / 42) % 10);
	int lotto_res = lotto_num[0]*100 + lotto_num[1]*10 + lotto_num[2];
	int calc_tmp = 0 ;
	System.out.println("Enter your lottery pick (three digits):");
	int[] user_num = new int[3];
	int user_num_res = input.nextInt();
	calc_tmp = user_num_res;
	user_num[0] = user_num_res%10;
	user_num_res /= 10;
	user_num[1] = user_num_res%10;
	user_num_res /= 10;
	user_num[2] = user_num_res%10;
	user_num_res = calc_tmp;
	
	System.out.println("Lottery is "+ lotto_res);
	int chk_num = 0;
	
	if (user_num_res == lotto_res)
	{
	      System.out.println("Exact match: you win $12,000");
	}
	else
	{
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(lotto_num[i] == user_num[j]) {
					chk_num++;
					break;
				}
			}
		}
		if(chk_num == 3)
		      System.out.println("Match all digits: you win $5,000");
		else if(chk_num == 0)
	      System.out.println("Sorry, no match"); 
		else
		  System.out.println("Match one digit: you win $2,000");
	}
	}
}
