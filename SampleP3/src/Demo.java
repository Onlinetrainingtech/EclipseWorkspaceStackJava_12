class Product
{
	int id=1001;//class or instanc variable
	void addStaff()
	{
		String name="mohamed";//local variable
		System.out.println("This is addStaff::"+id+""+name);
	}
	void addStudent()
	{
		System.out.println("This is addStudent::"+id);
	}
}
public class Demo {

	public static void main(String[] args) {
		
		
		Product p1=new Product();
		p1.addStaff();
		p1.addStudent();

	}

}
