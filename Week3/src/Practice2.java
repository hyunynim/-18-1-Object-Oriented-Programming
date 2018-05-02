import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int comWinCnt = 0;
		int playerWinCnt = 0;	
		Scanner input = new Scanner(System.in);
		while(Math.abs(comWinCnt - playerWinCnt) != 2) {
		int com = (int)(Math.random() * 3);
	
		System.out.printf("computer is %s\n", com == 0 ? "scissor" : (com==1 ? "rock" : "paper"));
		System.out.printf("scissor (0), rock (1), paper (2): ");
		int player = input.nextInt();
		if(player - com == 1 || player - com == -2) {
			System.out.printf("You won\n");
			++playerWinCnt;
		}
		else if(com - player == 1 || com - player == -2){
			System.out.printf("Computer won\n");
			++comWinCnt;
		}
		else 
			System.out.printf("Draw\n");
	}
		if(playerWinCnt > comWinCnt)
			System.out.printf("You won more than two times\n");
		else
			System.out.printf("Computer won more than two times\n");
	}
}
