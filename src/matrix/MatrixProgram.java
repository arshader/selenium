package matrix;

import java.util.Scanner;

public class MatrixProgram {
	public static void transposeMatrix(int r_length,int c_length,int a[][]){
		for(int i=0;i<r_length;i++){
			for(int j=0;j<c_length;j++){
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] readMatrix(int r,int c){
		int a[][]=new int [r][c]; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Matrix Element");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("You have Entered the All Element");
		sc.close();
		return a;
	}
	public static void displayMatrix(int a[][],int r,int c){
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	}
	public static void reverseColumnElement(int a[][]){
		for(int i=0;i<a.length/2;i++){
			for(int j=0;j<a[i].length;j++){
				int t=a[i][j];
				a[i][j]=a[a.length-1-i][j];
				a[a.length-1-i][j]=t;
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public static void reverseRowElement(int a[][]){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length/2;j++){
				int t=a[i][j];
				a[i][j]=a[i][a[i].length-1-j];
				a[i][a[i].length-1-j]=t;
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void bigEle_row_column(int a[][]){
		for(int i=0;i<a.length;i++){
			int r_big=a[i][0];
			int c_big=a[0][i];
			for(int j=0;j<a.length;j++){
				if(r_big<a[i][j]){
					r_big=a[i][j];
				}
				if(c_big<a[0][i]){
					c_big=a[j][i];
					
				}
			}
			System.out.println(i+1+"row-wise biggest element is:\t "+r_big);
			System.out.println(i+1+"column-wise biggest element is:\t "+c_big);
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row value/length for Matrix");
		int r_length = sc.nextInt();
		System.out.println("Enter Column value/length for Matrix");
		int c_length = sc.nextInt();
		

		int[][] readMatrix = readMatrix(r_length,c_length);
		
		
        System.out.println("Enter Matrix is :");
		displayMatrix(readMatrix,r_length,c_length);
			
			
		System.out.println("Transpose of matrix is ");
		//transposeMatrix(r_length,c_length,readMatrix);
		
		//
		System.out.println("Now Column wise reverse Matrix is:\t");
		//reverseColumnElement(readMatrix);
		
		System.out.println("Now Row wise reverse Matrix is:\t");
		reverseRowElement(readMatrix);
			

	}

}
