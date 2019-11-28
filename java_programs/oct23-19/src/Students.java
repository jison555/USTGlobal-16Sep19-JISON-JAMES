
public class Students extends Person {

	int id;
	double mark;

	public Students(String name,int age,int id,double mark) {

		super(name,age);
		this.id=id;
		this.mark=mark;


	}
	public void printDetails() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(mark);
		System.out.println(id);
	}

}
