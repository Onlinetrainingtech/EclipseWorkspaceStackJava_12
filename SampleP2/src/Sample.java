
public class Sample
{

	
	void addProduct()
	{
		System.out.println("This is addProduct");
	}
	void addCategory()
	{
		System.out.println("This is addCategory");
	}
	
	
	
	public static void main(String[] args)
	{

		System.out.println("This is main Method");
        Sample p1=new Sample();
        p1.addProduct();
        p1.addCategory();

	}

}
