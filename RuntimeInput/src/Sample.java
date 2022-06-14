import java.util.Scanner;

class Demo
{
	int pid;
	String pname;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is::");
		pid=sc.nextInt();
		pname=sc.next();
	}
	void get2()
	{
		System.out.println("Your value is::"+pid+""+pname);
	}
}



public class Sample {

	public static void main(String[] args) {
		
		
		Demo f1=new Demo();
		f1.get1();
		f1.get2();

	}

}
