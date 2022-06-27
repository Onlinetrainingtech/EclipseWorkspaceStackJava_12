import java.util.Scanner;

class B
{
	int cid;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the cid value is::");
		cid=sc.nextInt();
	}
}
class D1 extends B
{
	String cname;
	void get2()
	{
		System.out.println("Enter the cname is::");
		cname=sc.next();
	}
}
class D2 extends D1
{
	void get3()
	{
		System.out.println("CategoryId::"+cid+"CategoryName"+cname);
	}
}


public class Sample {

	public static void main(String[] args) {
		
		D2 f1=new D2();
		f1.get1();
		f1.get2();
		f1.get3();

	}

}
