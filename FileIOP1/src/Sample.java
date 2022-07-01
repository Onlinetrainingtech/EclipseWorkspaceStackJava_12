import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

class Demo
{
	
	void WriteData() throws IOException
	{
	   try
	   {
		   FileOutputStream fos=new FileOutputStream("D:\\f1.txt");
		   String s="mohamed";
		   byte f[]=s.getBytes();
		   fos.write(f);
		   System.out.println("FileInserted..");
	   }
	   catch(FileNotFoundException t)
	   {
		   System.out.println(t);
	   }
	}
	void readData() throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("D:\\f1.txt");
			FileOutputStream fos=new FileOutputStream("D:\\f2.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				//System.out.print((char)i);
				fos.write((byte)i);
			}
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	}
	void seqread() throws IOException
	{
		try
		{
			FileInputStream f1=new FileInputStream("D:\\f1.txt");
			FileInputStream f2=new FileInputStream("D:\\f2.txt");
			FileOutputStream f3=new FileOutputStream("D:\\copy.txt");
			SequenceInputStream sis=new SequenceInputStream(f1,f2);
			int i;
			while((i=sis.read())!=-1)
			{
				//System.out.print((char)i);
				f3.write((byte)i);
			}
			System.out.println("FileCopyed...");
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
}
public class Sample {

	public static void main(String[] args) throws IOException {
		
		Demo f1=new Demo();
		//f1.WriteData();
		//f1.readData();
		f1.seqread();

	}

}
