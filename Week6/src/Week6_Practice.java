import java.util.Scanner;

public class Week6_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.printf("Lin1 Result\n");
		System.out.printf("input 6 double number(a,b,c,d,e,f): ");
		LinearEquation lin = new LinearEquation(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());
		if(lin.IsSolvable()) 
			lin.GetData();
		
		System.out.println("");;
		System.out.println("");;
		System.out.println("");;

		System.out.printf("Lin2 Result\n");
		System.out.printf("input 6 double number(a,b,c,d,e,f): ");
		LinearEquation lin2 = new LinearEquation(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());
		if(lin2.IsSolvable()) 
			lin2.GetData();
		

		System.out.println("");;
		System.out.println("");;
		System.out.println("");;
		

		System.out.printf("input 4 double number(x1,y1,x2,y2)");
		TwoPoint p1 = new TwoPoint(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());
		System.out.printf("input 4 double number(x1,y1,x2,y2)");
		TwoPoint p2 = new TwoPoint(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());

		System.out.printf("Lin3 Result\n");
		LinearEquation lin3 = new LinearEquation(p1.GetA(), p1.GetB(), p2.GetA(), p2.GetB(), p1.GetC(), p2.GetC());
		if(lin3.IsSolvable())
			lin3.GetData();
		

		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.printf("input 4 double number(x1,y1,x2,y2");
		TwoPoint p3 = new TwoPoint(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());
		System.out.printf("input 4 double number(x1,y1,x2,y2");
		TwoPoint p4 = new TwoPoint(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());


		System.out.printf("Lin4 Result\n");
		LinearEquation lin4 = new LinearEquation(p3.GetA(), p3.GetB(), p4.GetA(), p4.GetB(), p3.GetC(), p4.GetC());
	}
	
	

}
