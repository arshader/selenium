package map.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapBasics {

	public static void main(String[] args) {
		HashMap<Integer,String> mapObj=new HashMap<Integer,String>();
		mapObj.put(101, "mahesh");
		mapObj.put(102, "raju");
		mapObj.put(103, "archana");
		mapObj.put(104, "sweta");
		System.out.println("Printing HashMap reference:\t\n"+mapObj);
		
		mapObj.put(101, "arjun");
		System.out.println("Printing HAshMap Reference :\t\n"+mapObj);
		
		Collection<String> all_values = mapObj.values();
		System.out.println("Printing mapObj.values():\t\n"+all_values);
		
		Set<Integer> all_keySet = mapObj.keySet();
		System.out.println("Printing mapObj.keySet():\t\n"+all_keySet);
		
		String eleme_at102 = mapObj.get(102);
		System.out.println("element at index 102:\t"+eleme_at102);
		
		int size = mapObj.size();
		System.out.println("mapObj.size():\t"+size);
		
		boolean containsKey = mapObj.containsKey(101);
		System.out.println("calling containskey :\t"+containsKey);
		
		boolean containsValue = mapObj.containsValue("raju");
		System.out.println("calling containsValue:\t"+containsValue);
		
		String string = mapObj.get("archana");
		System.out.println("calling mapObj.get(archana):\t"+string);
		
		
		Map<Integer,String> obj=new HashMap<Integer,String>();
	

		
	}

}
