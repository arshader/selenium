
public class ObjectExample {

	public static void main(String[] args) {
	
		Object obj=new Object();
	int hashCode = obj.hashCode();
	System.out.println("hashcode() of Object Class:\t"+hashCode);
	
	Object obj1=new Object();
	int hashCode2 = obj1.hashCode();
	System.out.println("hashcode() of another Object Of Object Class:\t"+hashCode2);
	
	ObjectExample objClass=new ObjectExample();
	int hashCode3 = objClass.hashCode();
	System.out.println("hashcode() on main Class:\t"+hashCode3);
	
	boolean equals = obj.equals(obj1);
	System.out.println("here Comparing obj and obj1 Of Object Class:\t"+equals);
	boolean equals2 = obj1.equals(objClass);
	System.out.println("obj and obj_Main comparision:\t"+equals2);
	System.out.println("obj1 and obj_Main comparision:\t"+equals2);
	
	
	String string = obj.toString();
	System.out.println("toString() of Object Class:\t"+string);
	String string2 = obj1.toString();
	System.out.println("toString() of another object of Object Class:\t"+string2);
	String string3 = objClass.toString();
	System.out.println("toString() of Main Class:\t"+string3);
	

	}

}
