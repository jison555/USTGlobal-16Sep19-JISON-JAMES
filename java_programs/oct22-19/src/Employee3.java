
public class Employee3 {

	String name;
	int eid;
	long aadharno;
	
	public Employee3(String name,int eid,long aadharno) {
		this.name=name;
		this.eid=eid;
		this.aadharno=aadharno;
	}
	
	Employee3(String name,int eid){
		this.name=name;
		this.eid=eid;
		
	}
	
	Employee3(int eid,String name){
		this.name=name;
		this.eid=eid;
		
	}
	void printDetails() {
		System.out.println("hi "+name+ "welcome to UST Global");
	}
}
