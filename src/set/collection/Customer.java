package set.collection;

public class Customer {
	private long mobilenumber;
	private String name;
	public long getmobilenumber(){
		return this.mobilenumber;
	}
	public String getname(){
		return this.name;
	}
	public void setname(String c_name){
		this.name=c_name;
	}
	public void setmobilenumber(long c_m_number)
   {
		this.mobilenumber=c_m_number;
	}
	public String toString(){
		return this.mobilenumber+" "+this.name;
	}
	public int hashCode(){
		Long l = this.mobilenumber;
		return l.hashCode();
	}
	public boolean equals(Object obj){
		boolean res=false;
		if(obj instanceof Customer){
			Customer c=(Customer)obj;
			if(this.mobilenumber==c.mobilenumber){
				return res=true;
			}
		}
		return res;
	}

}
