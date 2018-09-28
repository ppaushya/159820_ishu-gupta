package org.cap;

import java.util.Scanner;

public class Question3 {
	char a[];
	public void LetterCapitalize(String str) {
		int k=str.length();
		a=new char[k];
		for(int i=0;i<str.length();i++)
		{
			a[i]=str.charAt(i);
		}
		
	
	
	for(int j=0;j<a.length;j++)
	{
		if(a[0]>=97 && a[0]<=122)
		a[0]=(char)(a[0]-32);
		if(a[j]==' ')
		{
			a[j+1]=(char)(a[j+1]-32);
		}
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]);
	}
	
	}
	public static void main(String[] args) {
		Question3 obj=new Question3();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=scanner.nextLine();
		obj.LetterCapitalize(str);

	}

}
