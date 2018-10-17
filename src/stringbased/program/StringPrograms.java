package stringbased.program;

import java.util.Scanner;

public class StringPrograms {
	public static void occuranceOfChar(String st){
		System.out.println("By Comparing method , calculating occurance of character");
		char[] ch = st.toCharArray();
		int n = ch.length;
		System.out.println("length of String is \t:"+n);
		for(int i=0;i<n;i++){
			int count=1;
			for(int j=i+1;j<n;j++){
				if(ch[i]==ch[j]){
					count++;
					ch[j]=ch[n-1];
					n--;
					j--;
				}
			}
			System.out.println(ch[i]+"\t--->"+count+"\ttimes\n");
		}
	}
	public static void occuranceOfCharByBitsize(String st){
		System.out.println("Here Calculating Occurance of Char By Bit Size ()");
		char[] cha = st.toCharArray();
		int n = cha.length;
		System.out.println("length of Given String is :\t"+n);
	}

	public static void main(String[] args) {
		System.out.println("Enter String :");
		Scanner sc=new Scanner(System.in);
		String st = sc.nextLine();
		occuranceOfChar(st);
		}
}
