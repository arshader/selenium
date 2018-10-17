
public class Studentt_Main {

	public static void main(String[] args) {
		Studentt obj_studentt1=new Studentt("arshad",1001,90.1);
		
		Studentt obj_studentt2=new Studentt("Kriti",1002,70.1);
		
		System.out.println("obj_studentt reference only:\t"+obj_studentt1);
		System.out.println("obj_Studentt.toString():\t"+obj_studentt1.toString());
		
		System.out.println("obj_studentt reference only:\t"+obj_studentt2);
		System.out.println("obj_Studentt.toString():\t"+obj_studentt2.toString());

	}

}
