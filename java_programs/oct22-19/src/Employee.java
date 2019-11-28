
public class Employee {
	String name;
	int eid;
	
	public Employee(String ename,int empid) {
		name=ename;
		eid=empid;
		
	}
	void printDetails() {
		System.out.println("empoloyee name is "+name);
		System.out.println("employee id is "+ eid);
		
	}
	public static void main(String[] args) {
		
		Employee e1= new Employee("rashmika",143);
		e1.printDetails();
	
		Employee e2 = new Employee("mamasi",420);
		e2.printDetails();
		Employee e3 = new Employee("chacha",69);
		e3.printDetails();
	
		
	}
}
