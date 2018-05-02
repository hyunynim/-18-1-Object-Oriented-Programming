import java.util.Scanner;

public class TestCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.printf("Name of course : ");
		String courseName = input.nextLine();
		System.out.printf("Number of students in %s: ", courseName);
		int courseSize = input.nextInt();
		Course c1 = new Course(courseName, courseSize);
		c1.addStudent("Ann1");
		c1.addStudent("Ann2");
		c1.addStudent("Ann3");
		c1.addStudent("Ann4");
		c1.addStudent("Ann5");
		c1.addStudent("Ann6");
		c1.addStudent("Peter K");
		c1.addStudent("Ann7");
		c1.addStudent("Ann8");
		c1.addStudent("Ann9");
		c1.addStudent("Ann10");
		c1.addStudent("Ann11");
		c1.addStudent("Ann12");
		c1.printAll();
	
		System.out.println("");


		System.out.printf("Number of students in course1 after dorp Peter K: ");
		c1.dropStudent("Peter K");
		System.out.printf("%d\n",  c1.getNumberOfStudents());
		c1.printAll();
	
		System.out.println("");
		
		System.out.printf("Number of students in course1 after dorp Peter K: ");
		c1.clear();
		System.out.printf("%d\n",  c1.getNumberOfStudents());
		
	}

}
