
class Demo
{
	void get1()
	{
		int a1=100,b1=200;
		System.out.println("Multiple::"+(a1*b1));
		System.out.println("Greaterthan::"+(a1>b1));
		System.out.println("LogicalAND::"+((a1<b1)&&(b1>a1)));
		System.out.println("LogicalOR::"+((a1>b1)||(b1>a1)));
		
	}
	void get2()
	{
		int a=2,b=3;
		System.out.println("BitWiseAND::"+(a&b));
		System.out.println("BitWiseOR::"+(a|b));
		System.out.println("BitWiseXOR::"+(a^b));
		System.out.println("leftShift::"+(a<<1));
		System.out.println("RightShift::"+(a>>1));
		System.out.println("Increment::"+(a++));
	}
}

public class Sample {

	public static void main(String[] args) {
		
		
		Demo f1=new Demo();
		//f1.get1();
		f1.get2();

	}

}
