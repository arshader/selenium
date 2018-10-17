package map.collection;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		Player p1=new Player(10,"Virat");
		Player p2=new Player(7,"Dhooni");
		Player p3=new Player(12,"ABD");
		Player p4=new Player(10,"Virat");
		
		Team t1=new Team();
		t1.name="RCB";
		t1.country="Indian";
		
		Team t2=new Team();
		t2.name="MI";
		t2.country="Indian";
		
		Team t3=new Team();
		t3.name="KKR";
		t3.country="Indian";
		
		HashMap<Player,Team> mapObj=new HashMap<Player,Team>();
		mapObj.put(p1, t1);
		mapObj.put(p2, t2);
		mapObj.put(p3, null);
		mapObj.put(p4, t3);
		System.out.println(mapObj);

	}

}
