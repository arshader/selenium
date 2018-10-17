package map.collection;

public class Player {
	int number;
	String name;
	public String toString(){
		return this.name;
	}
	public Player(int p_number,String p_name){
		this.number=p_number;
		this.name=p_name;
	}
	public int hashCode(){
		return this.number;
	} 
	public boolean equals(Object obj){
		boolean res=false;
		if(obj instanceof Player){
			Player p_obj=(Player)obj;
			if(this.number==p_obj.number){
				return res=true;
			}
		}
		return res;
	}
	
	

}
