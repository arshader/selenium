package set.collection;

public class Employee {
	int id;
	String name;
	public Employee(int e_id,String e_name){
		this.id=e_id;
		this.name=e_name;
	}
	@Override
	public String toString(){
		return this.id+"  "+this.name;
	}
	@Override
	public int hashCode(){
		return this.id;
	}
	@Override
	public boolean equals(Object obj){
		boolean res=false;
		if(obj instanceof Employee){
			Employee e=(Employee)obj;
			if(this.id==e.id){
				res=true;
			}
		}
		return res;
	}

}
