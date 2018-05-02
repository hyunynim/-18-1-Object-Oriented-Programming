import java.util.Scanner;

public class Practice1_Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.printf("10개의 수를 입력하세요 : ");
			int[] num = new int[10];
			for(int i = 0; i<10; i++) {
				num[i] = input.nextInt();
			}
			BubbleSort(num);
			PrintArray(num);
	}
	static void BubbleSort(int[] num) {
		int tmp;
		
		for(int i = 0; i<10; i++) {
			for(int j = i+1; j<10; j++) {
				if(num[i] > num[j]) {
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
	}
	
	static void Printrray(int[] arr) {
		for(int val: arr)
			System.out.println(val);
	}

}
