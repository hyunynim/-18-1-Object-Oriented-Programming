import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Practice 3");
		System.out.print("Enter three edges (length indouble):");
		double length1 = input.nextDouble();
		double length2 = input.nextDouble();
		double length3 = input.nextDouble();
		
		if((length3 - length2 - length1) < 0 
				&& (length2 - length1 - length3) < 0
				&& (length1 - length3 - length2) < 0)
		{
			double res = length1 + length2 + length3;
			System.out.println("The perimeter is " + res);
		}
		else
		{
			System.out.println("Input is invalid");;
		}
	}
}
