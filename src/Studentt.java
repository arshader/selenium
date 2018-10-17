
public class Studentt {
	String name;
	int id;
	double percent;
	public Studentt(String s_name,int s_id,double s_percent){
		this.name=s_name;
		this.id=s_id;
		this.percent=s_percent;
	}
	public String toString(){
		return "Student["+name+","+id+","+percent+"]";
	}

}
