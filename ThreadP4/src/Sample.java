class Demo extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("I value is::"+i);
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		Demo t2=new Demo();
		t1.start();
		try
		{
			System.out.println("Join IN");
			t1.join();
			System.out.println("Join OUT");
		}
		catch(InterruptedException t)
		{
			
		}
		t2.start();

	}

}
