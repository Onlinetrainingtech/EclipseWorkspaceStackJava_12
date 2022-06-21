import java.util.Scanner;

public class Sample {

	
	int sum=0,rem,t;
	Scanner sc=new Scanner(System.in);
	void get2()
	{
		System.out.println("Enter the n value is::");
		t=sc.nextInt();
		while (t != 0)
		   {
		      rem = t % 10;
		      sum       = sum + rem;
		      t         = t / 10;
		   }
		System.out.println("SumOfDigits::"+sum);
	}
	
	
	public static void main(String[] args)
	{
		Sample d1=new Sample();
		d1.get2();

	}

}
