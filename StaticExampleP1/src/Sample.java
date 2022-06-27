class Demo
{
	static int a=10;//static variable
	void get1()
	{
		a++;
		System.out.println("Your data is::"+a);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		Demo f2=new Demo();
		f1.get1();
		f2.get1();

	}

}
