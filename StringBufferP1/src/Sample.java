
public class Sample 
{
	
	StringBuilder sb=new StringBuilder("Welcome");
	void get1()
	{
		System.out.println(sb.append("azar"));
		System.out.println(sb.reverse());
	}

	public static void main(String[] args) 
	{

        Sample s1=new Sample();
        s1.get1();

	}

}
