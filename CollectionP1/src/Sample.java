import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Sample 
{

	//HashSet<Integer>list1=new HashSet<>();
	//TreeSet<Integer>list1=new TreeSet<>();
	ArrayList<Integer>list1=new ArrayList<>();
	void get1()
	{
		list1.add(1001);
		list1.add(1002);
		list1.add(1003);
		list1.add(1004);
		list1.add(1004);
		
		Iterator<Integer>k1=list1.iterator();
		while(k1.hasNext())
		{
			System.out.println("Inside while loop::"+k1.next());
		}
		System.out.println("Searching the data is::"+list1.contains(1001));
		System.out.println("Remove the data is:"+list1.remove(1001));
		System.out.println("After Remove size of data::"+list1.size());
		System.out.println("Total Data is display::"+list1);
	}
	
	
	
	public static void main(String[] args) {
		
		Sample f1=new Sample();
		f1.get1();

	}

}
