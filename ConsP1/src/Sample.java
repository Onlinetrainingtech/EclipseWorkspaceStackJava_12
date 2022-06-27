class Product
{
	Product()
	{
		System.out.println("This is default cons...");
	}
	Product(int pid,String pname)
	{
	   System.out.println("Your ProductId is::"+pid+""+pname);	
	}
	void get1()
	{
		System.out.println("This is normal functions..");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		new Product();//default argunment
		Product p1=new Product(1001,"apple");//param cons
		p1.get1();

	}

}
