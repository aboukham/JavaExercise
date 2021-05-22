
public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	private Address homeAddress;
	private Address workAddress;
	
	public Employee(Address hAdd, Address wAdd){
		homeAddress = hAdd;
		workAddress = wAdd;
	}
	
	public String getName(){
		return firstName + " " + lastName;
	}
	public void setName(String fname, String lname){
		firstName = fname;
		lastName = lname;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void setSalary(double s){
		salary = s;
	}
	
	public static void main(String[] args) {
		Address		homeAddress1;
		Address		workAddress1;
		Address		homeAddress2;
		Address		workAddress2;
		
		homeAddress1 = new Address();
		workAddress1 = new Address();
		homeAddress2 = new Address();
		workAddress2 = new Address();

		Employee	e1;
		Employee	e2;
		
		homeAddress1.setAddress("543 state street", "Schenectady", "NY", "12307");
		workAddress1.setAddress("734 hudson avenue", "Albany", "NY", "12367");
		homeAddress2.setAddress("24 union street", "Boston", "MA", "23074");
		workAddress2.setAddress("504 washington avenue", "Boston", "MA", "23074");
		e1 = new Employee(homeAddress1, workAddress1);
		e2 = new Employee(homeAddress2, workAddress2);
		e1.setName("John", "Smith");
		e1.setSalary(70500.0);
		e2.setName("David", "Alaba");
		e2.setSalary(65000.5);
		
		System.out.println("-----------------------------------------------------------" );
		System.out.println("employee 1 name is :\n" + e1.getName() + "\n\n");
		System.out.println("employee 1 home address is :\n" + e1.homeAddress.getAddress() + "\n\n" );
		System.out.println("employee 1 work address is :\n" + e1.workAddress.getAddress() + "\n" );
		System.out.println("-----------------------------------------------------------" );
		System.out.println("employee 2 name is :\n" + e2.getName() + "\n\n");
		System.out.println("employee 2 home address is :\n" + e2.homeAddress.getAddress() + "\n\n" );
		System.out.println("employee 2 work address is :\n" + e2.workAddress.getAddress() + "\n" );
		System.out.println("-----------------------------------------------------------" );
		
	}

}
