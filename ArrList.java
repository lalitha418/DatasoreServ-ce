import java.util.List;
import java.util.ArrayList;

public class ArrList {

	public static void main(String[] args) 
	{
		/*List<String> al= new ArrayList<>();      //retainAll
		al.add("Nandhu");
		al.add("lalitha");
		al.add("lalitha");
		al.add("sravss");

		List<String> al1= new ArrayList<>();
		al1.add("sravss");
		al1.add("apurv");
		al1.add("lalitha");


		al1.retainAll(al);
		System.out.println(al1);
		al1.add("apurv");
		al.retainAll(al1);
		System.out.println("al"+al);
		System.out.println("al1"+al1);*/
		
  	List<String> rem= new ArrayList<>();      //removeAll
		rem.add("sravss");
		rem.add("apurv");
		rem.add("lalitha");
		rem.add("sravss");rem.add(null);
		System.out.println("lastIndex:"+rem.lastIndexOf(null));
		
		List<String> al1= new ArrayList<>();
		al1.add("sravss");
		al1.add("Nandhu");
		al1.add("lalitha");
		al1.add(1,"Sindhu");
		al1.add(null);
		System.out.println(al1.remove("nandhu"));
		System.out.println(al1);
		al1.removeAll(rem);
		System.out.println(al1);
		//rem.clear();
		System.out.println(rem);
		System.out.println(al1.hashCode());
		System.out.println("before"+rem);
				
		rem.removeIf(n-> (n=="lalitha"));
		System.out.println("after"+rem);
		//System.out.println("lastIndex:"+rem.lastIndexOf("sravss"));
		System.out.println(rem.get(0));
	   ((ArrayList<String>) rem).trimToSize();

	}
	

}
