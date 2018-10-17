
public class HashTest {

	public static void main(String[] args) {
		Integer obj1_Integer=new Integer(35);
		Integer obj2_Integer=new Integer(135);
		System.out.println("obj1_Integer.hashcode():\t"+obj1_Integer.hashCode());
		System.out.println("obj2_Integer.hashcode():\t"+obj2_Integer.hashCode());
		
		
		String s1=new String("Guldu");
		String s2=new String("Gulduu");
		
		System.out.println("s1.hashcode of String:\t"+s1.hashCode());
		System.out.println("s1.hashcode of String:\t"+s2.hashCode());
		System.out.println("now printing String toString and Reference");
		System.out.println("s1.toString():\t"+s1.toString());
		System.out.println("s1 reference:\t"+s1);
		
		System.out.println("---Here Printing without Overriding---");
		
		System.out.println("obj1_Integer.toString():\t"+obj1_Integer.toString());
		System.out.println("obj1_Integer reference:\t"+obj1_Integer);

	}

}
