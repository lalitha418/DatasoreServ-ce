import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {
		Set<String> set1=new TreeSet<>();
		set1.add("lalitha");
		set1.add("adarsh");
		set1.add("Sravss");
		set1.add("nandhu");
		set1.add("apurv");
		Iterator itr=set1.iterator();
		Iterator itr1=set1.iterator();
		System.out.println("\n 1");
	
		while(itr.hasNext())
		{
			System.out.println(itr.next());
	          
		}
	    System.out.println("\n 2");
		for(String str:set1)
			
		{
			System.out.println(str);
			
		}
		  System.out.println("\n 3");
		//set1.remove("adarsh");
		set1.add("zzz");// we added elements already
		
		System.out.println(itr.hasNext());//once it iterates it doesn't do again because elements removed
		while(itr.hasNext())
		{
			System.out.println(itr.next());
	
		}
		  System.out.println("\n 4");
		for(String str:set1)
			
		{
			System.out.println(str);
			//set1.remove("dfjsd");
		}
		  System.out.println("\n");
	}

}
