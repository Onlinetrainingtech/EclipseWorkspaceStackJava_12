import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		int i,j,n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n and m value is::");
		n=sc.nextInt();
		m=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("I and J values::"+i+","+j);
			}
		}

	}

}
