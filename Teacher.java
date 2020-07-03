public class Teacher extends Person{
	private int numCourse;
	private String[] courses;
	private int maxCourses =5;
	private double baseSalary = 12000;

	public Teacher(String name, String address){
		setName(name);
		setAddress(address);
		numCourse = 0;
		courses = new String[maxCourses];
		
	}

	public Teacher(String name, String address, int salary){
		setName(name);
		setAddress(address);
		numCourse = 0;
		courses = new String[maxCourses];
		this.baseSalary = salary;
	}

	public void setBaseSalary(int salary){
		this.baseSalary=salary;

	}

	public void addCourse(String course){
		courses[numCourse]=course;
		numCourse++;
	}

	public void printBaseSalary(){
		System.out.println(this);
		System.out.println("Base salary: "+ baseSalary);
	}

}