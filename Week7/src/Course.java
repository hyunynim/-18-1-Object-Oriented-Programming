public class Course {
  private String courseName;
  private String[] students = new String[DEFAULT_STUDENTS_SIZE];
  private int numberOfStudents;
  public static final int DEFAULT_STUDENTS_SIZE = 3;
  
  public Course(String courseName) {
    this.courseName = courseName;
  }
  
  public Course(String courseName, int size) {
	    this.courseName = courseName;
	    this.students = new String[size];
	  }
  
  public void addStudent(String student) {
	  if(students.length <= numberOfStudents) {
		  String[] tmp = new String[numberOfStudents * 2];
		  System.arraycopy(students,  0,  tmp,  0,  students.length);
		  students = tmp;
	  }
    students[numberOfStudents] = student;
    numberOfStudents++;
  }
  
  public String[] getStudents() {
    return students;
  }

  public int getNumberOfStudents() {
    return numberOfStudents;
  }  

  public String getCourseName() {
    return courseName;
  }  
  
  public void dropStudent(String student) {
    // Left as an exercise in Exercise 10.9
	  int i;
	  for(i =0; i < numberOfStudents; ++i) {
		  if(student.equals(students[i])) {
			  break;
		  }
	  }
	  while(i+1 < numberOfStudents) {
	  	  students[i] = students[i+1];
		  ++i;
	  }
	  --numberOfStudents;
  }
  
  public void clear() {
	  students = new String[DEFAULT_STUDENTS_SIZE];
	  numberOfStudents = 0;
  }
  
  public void printAll() {
	  for(int i = 0; i<numberOfStudents; ++i)
		  System.out.printf("%s ", students[i]);
  }
}