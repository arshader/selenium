
public class Main {

	public static void main(String[] args) {
		Object obj=new Object();
		String string = obj.toString();
		System.out.println("obj.toString():\t"+string);
		System.out.println("object Class refreence:\t"+obj);
		System.out.println("----------------");
		
		Sample_Main obj_sample_main=new Sample_Main();
		
		System.out.println("obj_sample.toString():\t"+obj_sample_main.toString());
		System.out.println("obj_sample Class refreence:\t"+obj_sample_main);
		System.out.println("------------------------");
		
		
		
		
		System.out.println("---------------------------------");
		
		Simple_Main obj_simple_main=new Simple_Main();
		String string2 = obj_simple_main.toString();
		System.out.println("obj_simple_main.toString():\t"+string2);
		System.out.println("obj_simple_main reference:\t"+string2);
		
		

	}

}
