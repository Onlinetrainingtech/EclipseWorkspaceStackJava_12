class B
{
	int pid=1001;
	void get1()
	{
		System.out.println("Welcome to base class");
	}
}
class D extends B
{
	void get2()
	{
		System.out.println("Derived class::"+pid);
	}
}



public class Sample {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
