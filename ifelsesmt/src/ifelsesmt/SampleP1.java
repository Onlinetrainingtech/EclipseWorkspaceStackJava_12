package ifelsesmt;

import java.util.Scanner;

public class SampleP1 
{
	int age;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
        
		System.out.println("Enter the age is::");
		age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Your age > 18");
		}
		else
		{
			System.out.println("Your age < 18 ");
		}

	}
	
	
	public static void main(String[] args) {
		
		SampleP1 f1=new SampleP1();
		f1.get1();
		
	}

}
