import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Tree {
	class Obj{
		String name;
		public Obj(String name) {
			
		}
	}

	public static void main(String[] args)
	{
		HashSet<Obj> set1=new HashSet<>();
		set1.add(new Tree().new Obj("ramya"));
		set1.add(new Tree().new Obj("satya"));
		
		System.out.println(set1);
		
		
		
		Set<Obj> set2=new HashSet<>();
		Set<Obj> set3=new LinkedHashSet<>();
		
		test(set2);
		test(set3);
	}
	
	public static void test(Set<Obj> param) {
		System.out.println(param);
	}

}
