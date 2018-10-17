package set.collection;

import java.util.Collections;
import java.util.HashSet;

public class CustomerHashSetDemo {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setmobilenumber(9878989);
		c1.setname("samsung");
		
		Customer c2=new Customer();
		c2.setmobilenumber(2222987);
		c2.setname("Nokia");
		
		Customer c3=new Customer();
		c3.setmobilenumber(123456);
		c3.setname("Oppo");
		
		HashSet<Customer> obj=new HashSet<Customer>();
		obj.add(c1);
		obj.add(c2);
		obj.add(c3);
		
		
		System.out.println("printing reference oh hashset object :\t"+obj);
		System.out.println("now looping hashset object using for each lopp:\n");
		for(Customer cust:obj){
			System.out.println(""+cust);
		}

	}

}
