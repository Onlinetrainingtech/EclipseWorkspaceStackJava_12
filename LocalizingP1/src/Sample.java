import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Sample {

	public static void main(String[] args) {
		
		DateFormat df=DateFormat.getDateInstance(DateFormat.LONG,new Locale("no","NO"));
		
		//DateFormat df=DateFormat.getTimeInstance(DateFormat.LONG,new Locale("en","US"));
		String d2=df.format(new Date());
		
		System.out.println("Your data is::"+d2);

	}

}
