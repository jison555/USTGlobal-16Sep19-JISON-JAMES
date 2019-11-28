
public class Student {
	String name;
	int rollno;
	final String cname="QSPIDERS";
	final int cid;
	

	public Student(String name,int rollno,int cid) {
		this.name=name;
		this.rollno=rollno;
		this.cid=cid;
		
	}
	
	final void printDetails() {
		System.out.println("hi " +name+ " welcome to "+cname );
	}
	
	final void printDetails(String name1) {
		System.out.println("hi "+name1+" welcome to"+ cname);
	}

}
