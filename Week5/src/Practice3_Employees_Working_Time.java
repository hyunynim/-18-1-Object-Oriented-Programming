import java.util.Scanner;

public class Practice3_Employees_Working_Time {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[][] workingTime = new int[8][7];
		int[] employeeTime = new int[8];
		int[] employeeName = {0, 1, 2, 3, 4, 5, 6, 7};
		
	setWorkingTimeRandon(workingTime, employeeTime);
	printWorkingTime(workingTime);
	
	System.out.println("");
	System.out.println("");
	System.out.println("");
	
	sortTime(employeeName, employeeTime);
	printResult(employeeName, employeeTime);
	}
	
	static void setWorkingTimeRandon(int[][] workingTime, int[]employeeTime) {
		for(int i = 0; i<8; i++) {
			for(int j = 0; j<7; j++) {
				workingTime[i][j] = (int)(Math.random()*10 + 1);
				employeeTime[i] += workingTime[i][j];
			}
		}
	}
	
	static void printWorkingTime(int[][] workingTime) {
		String[] day = {"Su", "M", "T", "W", "Th", "F", "Sa"};
		for(int i = 0; i<9; i++) {
			for(int j = 0; j<8; j++) {
				if(i == 0) {
					if(j == 0)
						System.out.printf("          ");
					else
					System.out.printf("%3s", day[j-1]);
				}
				else {
					if(j == 0)
						System.out.printf("Employee%d ", j);
					else
						System.out.printf("%3d", workingTime[i-1][j-1]);
				}
			}
			System.out.println("");
		}
	}
	
	static void printResult(int[] name, int[] time) {
		for(int i = 0; i<8; i++) {
			System.out.printf("Employee%d : %d\n", name[i], time[i]);
		}
	}
	
	static void sortTime(int[] name, int[] time) {
		int tmp;
		for(int i = 0; i<8; i++) {
			for(int j = i; j<8; j++) {
				if(time[i] < time[j]) {
					tmp = time[i];
					time[i] = time[j];
					time[j] = tmp;
					tmp = name[i];
					name[i] = name[j];
					name[j] = tmp;
					}
				}
			}
	}
}


