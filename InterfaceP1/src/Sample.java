
public interface Sample 
{
    void get1();
}
interface b2
{
	void get2();
}
class D implements Sample,b2
{
	public void get1()
	{
		System.out.println("This is get1 functions..");
	}
	public void get2()
	{
		System.out.println("This is get2 method..");
	}
}
class Demo
{
	public static void main(String as[])
	{
		D f1=new D();
		f1.get1();
		f1.get2();
	}
}
