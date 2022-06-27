class Demo
{
	void add(int a1,float f1)
	{
		System.out.println("Your function-1::"+a1+""+f1);
	}
	void add(int b1)
	{
		System.out.println("Your function-2:"+b1);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.add(100,2.3f);
		f1.add(300);

	}

}
