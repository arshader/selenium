package array;

import java.util.Scanner;

public class insert_elem_array {
	public static int[] insert(int []a,int in,int elem){
		int na_len = a.length+1;
		int na[]=new int [na_len];
		for(int i=0;i<in;i++){
			na[i]=a[i];
		}
		na[in]=elem;
		for(int i=in;i<a.length;i++){
			na[i+1]=a[i];
		}
		return na;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the length of array");
		Scanner sc=new Scanner(System.in);
		int leng = sc.nextInt();
		int []a=new int [leng];
		System.out.println("Now enter The Array Elements");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements are :=>");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println("enter index at what u want to enter the element");
		int in = sc.nextInt();
		System.out.println("u have entered \t"+in);
		System.out.println("enter the element u want to replace with ");
		int elem = sc.nextInt();
		System.out.println("u have entered new elemenmt is :\t"+elem); 
		int[] new_array = insert(a,in,elem);
		System.out.println("After inserting new Array is:\t");
		for(int i=0;i<new_array.length;i++){
			System.out.println(new_array[i]);
		}

	}

}
