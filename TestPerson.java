public class TestPerson{
	public static void main(String[] args){
		System.out.println("Details of students: ");
		System.out.println("...............");
		Student s1 = new Student ("Sanjani", "UCSC, Colombo");
		s1.addCourseGrade("IS2104",67);
		s1.addCourseGrade("IS2104",87);
		s1.printGrade();

		System.out.println("Details of teachers: ");
		System.out.println("...............");
		Teacher t1 = new Teacher ("Mark Silva", "UCSC, Colombo");
		t1.printBaseSalary();
		String [] courses = {"CS11201","CS1234"};
	
		for (String course : courses){
			t1.addCourse(course);
			System.out.println("Course" + course + "assigned. ");
		}


	}

}