class Person{
	int nic,salary;
	String name;
	double height,weight;
	
	public void setPersonalDetails(int n,String na,double h,double w,int s)
	{
		nic=n;
		name=na;
		height=h;
		weight=w;
		salary=s;
	}
	
	public void showPersonalDetails()
	{
		System.out.println("NIC :"+nic);
		System.out.println("Name :"+name);
		System.out.println("Height :"+height);
		System.out.println("Weight :"+weight);
		System.out.println("Salary :"+salary);
	}
	
}
class personData{
  public static void main(String args[])
  {
	  Person P1=new Person();
	  P1.setPersonalDetails(12345,"Anne",5.2,45.8,0);
	  P1.showPersonalDetails();
	  
	  System.out.println("\n");
	  
	  
	  Person p1=new Person();
	  p1.setPersonalDetails(23456,"Bob",6.5,57.6,0);
	  P1.showPersonalDetails();
	  
	  System.out.println("\n");
	  
	  
	  Person p2=new Person();
	  p2.setPersonalDetails(34567,"Cindy",4.8,45.1,0);
	  p2.showPersonalDetails();
	  
	  
  }
}