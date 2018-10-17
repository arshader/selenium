package array;

import java.util.Scanner;

public class insert_at_specified {
	
    public static int[] readArray(){
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of Element");
		int length = sc.nextInt();
		int a[]=new int[length];
		System.out.println("Now Enter The Elements");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		return a;
    }
    
    public static void displayArray(int a[]){
    	for(int i=0;i<a.length;i++){
    		System.out.println(a[i]);
    	}
    }
    
    public static int[] insertElem(int in,int ele,int[] a){
    	int i=0;
    	int le=a.length+1;
    	int [] na=new int[le];
    	for( i=0;i<in;i++){
    		na[i]=a[i];
    	}
    	na[in]=ele;
    	for( i=in;i<a.length;i++){
    		na[i+1]=a[i];
    	}
    	return na;
    }

	public static void main(String[] args) {
		int[] readArray = readArray();
		displayArray(readArray);
		System.out.println("---------***********___________");
		int[] afterinsert_value = insertElem(2,32,readArray);
		displayArray(afterinsert_value);
	}

}
