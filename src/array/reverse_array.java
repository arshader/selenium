package array;

import java.util.Scanner;

public class reverse_array {
	public static int[] readArray(int n){
		int a[]=new int[n];
		System.out.println("Now Enter Element of array");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		sc.close();
		return a;
	}
	public static void displayArray(int [] a){
		System.out.println("Array Elements are");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

	public static int[] reverseArray(int [] a){
		System.out.println("After reverse Array is ");
		int ra[]=new int [a.length];
		int len=a.length;
		System.out.println("length of Array"+len);
		for(int i=len/2;i>0;i--){
			int t=a[i];
			ra[i]=t;
		}
		return ra;
	} 
	public static void main(String[] args) {
		System.out.println("Enter length of array");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int[] readArray = readArray(n);
		displayArray(readArray);
		int[] reversedArray = reverseArray(readArray);
		displayArray(reversedArray);
		sc.close();

	}

}
