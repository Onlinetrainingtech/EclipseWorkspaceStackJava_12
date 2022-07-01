class Demo
{
	void get1()
	{
		try
		{
			int a=100/2;
			System.out.println("Your data is::"+a);
		}
		catch(ArithmeticException t)
		{
			System.out.println("Please check the Program"+t);
		}
		finally
		{
			//code
		}
		
		System.out.println("Normal flow");
	}
	void get2()
	{
		try
		{
			String s1="null";
			System.out.println("Your length is::"+s1.length());
		}
		catch(NullPointerException t)
		{
		    System.out.println("Please check NullPointer"+t);
		}
	}
	void get3()
	{
		try
		{
			try
			{
				
			}
			catch(ArithmeticException t1)
			{
				
			}
			try
			{
				
			}
			catch(NullPointerException t2)
			{
				
			}
		}
		catch(Exception t3)
		{
			
		}
	}
	void get4()
	{
		try
		{
			
		}
		catch(ArithmeticException t1)
		{
			
		}
		catch(NullPointerException t2)
		{
			
			
		}
		catch(Exception t3)
		{
			
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		//f1.get1();
		f1.get2();

	}

}
