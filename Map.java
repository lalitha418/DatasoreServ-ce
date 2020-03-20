import java.util.*;
public class Map {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"jsdha");
		map.put(3,"nandhu");
		map.put(2,"sravss");
		map.put(5,"devi");
		System.out.println(map.clone());
		//System.out.println(Object =map.clone());
		System.out.println(map);
		HashMap<Integer,String> lhash=new LinkedHashMap<>();
		System.out.println(lhash);
		map.remove(3);
		//map.addALL(lhash);
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("lalitha"));
		
		System.out.println(map.keySet());
		System.out.println( map.get(4));
		System.out.println( map.get("kdkd"));
		
		

	}


	}


