class Demo extends Thread
{
	public void run()
	{
		System.out.println("This is Thread Method.."+currentThread().getName());
		System.out.println("Get the Priority.."+currentThread().getPriority());
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		Demo t2=new Demo();
		t1.start();
		t2.setName("Welcome");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.isAlive());
		t2.start();
		System.out.println(t1.isInterrupted());

	}

}
