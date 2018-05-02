import java.util.Scanner;

public class Pratice2_Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.printf("몇개? ");
		int szArr = input.nextInt();
		
		int[] num = new int[szArr];
		
		System.out.printf("숫자 %d개 입력 : ",  szArr);
		for(int i = 0; i<szArr; i++)
			num[i] = input.nextInt();
		
		QuickSort(num, 1, num.length-1, num[0]);
		printArr(num);
		
	}
	
	static void printArr(int[] arr) {
		for(int val: arr)
			System.out.printf("%d ", val);
	}
	
	static int QuickSort(int[] arr, int left, int right, int pivot) {
		int iLeft = 0;
		int iRight = 0;
		int tmp = 0;
		int returnPivot;
		
		while((left + iLeft) < (right - iRight)) {
			while(pivot > arr[left + iLeft])
				iLeft++;
			while(pivot < arr[right - iRight])
				iRight++;
			
			tmp = arr[left + iLeft];
			arr[left + iLeft] = arr[right - iRight];
			arr[right - iRight] = tmp;
			iLeft++;
			iRight++;
		}
		tmp = arr[0];
		arr[0] = arr[right - iRight];
		arr[right - iRight] = tmp;
		returnPivot = right - iRight;
		
		return returnPivot;
	}
}
