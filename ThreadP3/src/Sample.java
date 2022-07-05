class Demo extends Thread
{
	synchronized void get1()throws InterruptedException
	{
		try
		{
		System.out.println("IN");
		wait(1000);
		System.out.println("OUT");
		}
		catch(IllegalMonitorStateException t)
		{
			System.out.println(t);
		}
	}
	void get2() throws InterruptedException
	{
		notify();
		get1();
	}
}
public class Sample {

	public static void main(String[] args) throws InterruptedException {
		
		Demo t1=new Demo();
		t1.get1();
		t1.get2();

	}

}
