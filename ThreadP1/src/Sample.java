class Demo implements Runnable
{
	public void run()
	{
		System.out.println("This is the Run Method..");
	}
}



public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		Thread th=new Thread(t1);
		th.start();

	}

}
