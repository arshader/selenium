
public class Student {
	String name;
	int id;
	double percent;
	
	public Student(String name,int id,double percent){
		this.id=id;
		this.name=name;
		this.percent=percent;
	}

	public int hashcode(){
		return id;
	}

	public static void main(String[] args) {
		Object obj=new Object();
		System.out.println("obj.hashcode() of Object Class:\t"+obj.hashCode());
		System.out.println("---------------------");
		
		Sample obj_sample=new Sample("rajan",001);
		System.out.println("obj.hashcode  of Sample Class:\t"+obj_sample.hashcode());
		System.out.println(obj_sample.eid);
		System.out.println(obj_sample.ename);
		System.out.println("---------------------");
		Sample obj_sample2=new Sample("rakesh",002); 
		System.out.println("another obj.hashcode() of Sample :\t"+obj_sample2.hashcode());
		System.out.println("---------------");
		
		Student obj_student=new Student("arshad",101,90.1);
		System.out.println("obj.hashcode of student:\t"+obj_student.hashcode());
		
		Student obj_student2=new Student("jakir",102,70.4);
		System.out.println("another obj.hashcode of student:\t"+obj_student2.hashcode());
		

	}

}
