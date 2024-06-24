class Employee{
	int empid = 34343;
	String empname = "Elon Musk";
	double salary = 456789.76;
	boolean is_he_alive = true;

	public static void main(String[] args){
		Employee emp = new Employee();
		System.out.println(emp.empid);
		System.out.println(emp.empname);
		System.out.println(emp.salary);
		System.out.println(emp.is_he_alive);
	}
}