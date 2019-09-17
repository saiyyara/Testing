package seleniumpro;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) 
	{
		ArrayList<String> arrlist=new ArrayList<String>();
		arrlist.add("Sunday");
		arrlist.add("Monday");
		arrlist.add("Tuesday");
		arrlist.add("Wednesday");
		arrlist.add("Thursday");
		arrlist.add("Friday");
		arrlist.add("Saturday");
		
		System.out.println(arrlist.get(3));
		System.out.println("--------------------------");
		Iterator<String> list=arrlist.iterator();
		while(list.hasNext())
		{
			System.out.println(list.next()); 
		}

	}

}
