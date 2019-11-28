
public class Employee2 {
	
	String name;
	int eid;
	
	public Employee2(String name,int eid) {
		this.name=name;
		this.eid=eid;
		
	}
	 void  printDetails() {
		System.out.println("empoloyee name is "+name);
		System.out.println("employee id is "+ eid);
		this.sayHello();
		
	}
	 void sayHello() {
		 System.out.println("hello "+name+ " Welome to UST Global company");
	 }
	
	public static void main(String[] args) {
		Employee2 e1=new Employee2("deepika", 123);
		e1.printDetails();
		Employee2 e2=new Employee2("alia", 542);
		e2.printDetails();
		Employee2 e3=new Employee2("kavya", 233);
		e3.printDetails();
		
	}

}
