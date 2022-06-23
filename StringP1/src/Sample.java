
public class Sample 
{
	//String s1="Welcome to String Concepts";
	String s1=new String("admin");
	void get1()
	{
		System.out.println("This is String value is::"+s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.compareTo("admin"));
		System.out.println(s1.equals("admin"));
		System.out.println(s1.charAt(1));
		System.out.println(s1.startsWith("admin"));
		System.out.println(s1.endsWith("n"));
	}

	public static void main(String[] args) 
	{
		
		Sample s1=new Sample();
		s1.get1();

	}

}
