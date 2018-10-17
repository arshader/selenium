package set.collection;

import java.util.HashSet;

public class EmpHashSetDemo {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"Aftab Khan");
		Employee e2=new Employee(2,"Alia Bhatt");
		Employee e3=new Employee(3,"Parineeti Kapoor");
		Employee e4=new Employee(4,"Shradhha kapoor");
		
		HashSet<Employee> obj=new HashSet<Employee>();
		obj.add(e1);
		obj.add(e2);
		obj.add(e3);
		obj.add(e4);
		System.out.println("Printing Reference of HashSet Obj:"+obj);
		System.out.println("Now iterationg using foreach Loop:\n");
		for(Employee emp:obj)
		{
			System.out.println(emp);
		}
		

	}

}
