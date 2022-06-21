import java.util.Scanner;

public class Sample {

	int n,reverse=0;
	Scanner sc=new Scanner(System.in);

	void get1()
	{
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		reverse=0; 
		while (n != 0)
		   {
		      reverse = reverse * 10;
		      reverse = reverse + n%10;
		      n       = n/10;
		   }
		System.out.println("Reverse the Number is::"+reverse);
	}
	
	public static void main(String[] args) {
		
		
		Sample d1=new Sample();
		d1.get1();

	}

}
