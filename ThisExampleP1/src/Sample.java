class Demo
{
	int empid;
	String empname;
	void get1(int empid,String empname)
	{
		this.empid=empid;
		this.empname=empname;
		System.out.println("Your data is::"+empid+""+empname);
	}
	void get2()
	{
		System.out.println("Anotherfunction::"+empid+""+empname);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1(1000,"azar");
		f1.get2();

	}

}
