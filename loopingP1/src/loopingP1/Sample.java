package loopingP1;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) 
	{
	  
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n::");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			
			if(i%2==0)
			{
				System.out.println("Even"+i);
			}
			else
			{
				System.out.println("Odd"+i);
			}
			//System.out.println("I value is::"+i);
		}

	}

}
