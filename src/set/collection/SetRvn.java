package set.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class SetRvn {

	public static void main(String[] args) {
		System.out.println("Upcasted hashSet:\n");
		Collection<String> setobj=new HashSet<String>();
		boolean isadd = setobj.add("aaaa");
		System.out.println("printing Collection.add() after insertion of eleemnt:\t"+isadd);
		if(setobj instanceof Collection){
			System.out.println("setObj is of type Collection:\t");
		}
		System.out.println("Hashset object normal:\n");
		HashSet<String> hashset_obj=new HashSet<String>();
		boolean is_added = hashset_obj.add("bbbbb");
		System.out.println("printing hashSet.add() afetr inserting an eleemnt:\t"+is_added);
		hashset_obj.add("hashset ");
		int hashset_size = hashset_obj.size();
		System.out.println("size is :\t"+hashset_size);
		Stream<String> stream = hashset_obj.stream();
		System.out.println("hashset_obj.stream() gives:\t"+stream);
		System.out.println("printing hashSet_obj:\t"+hashset_obj);
		ArrayList<String> arraylist_obj=new ArrayList<String>();
		arraylist_obj.add("arraylist element 1");
		arraylist_obj.add("arraylist element 2");
		arraylist_obj.add("arraylist element 3");
		
		System.out.println("Printing arrayList Reference:\t"+arraylist_obj);
		
		String string_at2 = arraylist_obj.get(2);
		System.out.println("element at index 2:\t"+string_at2);
		
		
		

	}

}
