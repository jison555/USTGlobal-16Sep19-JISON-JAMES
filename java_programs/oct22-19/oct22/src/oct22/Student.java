package oct22;

public class Student {
	int id;
	String name;
	String clgname;
	int mob;
	double mark;
	public Student(int id,String name,String clgname,int mob,double mark)
	{
		this.id=id;
		this.name=name;
		this.clgname=clgname;
		this.mob=mob;
		this.mark=mark;
	}
	
	void printDetails() {
		System.out.println("the id is"+id);
		System.out.println("the name is"+name);
		System.out.println("the clgname is "+clgname);
		System.out.println("the mobno is "+mob);
		System.out.println("the mark is"+mark);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("progrm starts");
		
		Student s1=new Student(101,"akhil","kvm",789388,23.45);
		s1.printDetails();
		Student s2=new Student(102,"ram","kvm",456821,34.45);
		s2.printDetails();
		Student s3=new Student(103,"ravi","kvm",54688,34.00);
		s3.printDetails();
		Student s4=new Student(104,"brozz","kvm",25688,23.45);
		s4.printDetails();
		Student s5=new Student(105,"khan","kvm",78688,23.45);
		s5.printDetails();
		Student s6=new Student(106,"mahi","kvm",44688,23.45);
		s6.printDetails();
		Student s7=new Student(107,"don","kvm",12288,23.45);
		s7.printDetails();
		Student s8=new Student(108,"chahal","kvm",85688,23.45);
		s8.printDetails();
		Student s9=new Student(109,"kalii","kvm",99688,23.45);
		s9.printDetails();
		Student s10=new Student(110,"madhu","kvm",43688,23.45);
		s10.printDetails();
		
		
	}
	

}
