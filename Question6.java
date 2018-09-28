package org.cap;

import java.util.Scanner;

public class Question6 {
	
	public void factorial(int p) {
		int fact=1;
		for(int i=p;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println("factorail of"+ p + "is :" +fact);
		
	}

	public static void main(String[] args) {
		Question6 obj=new Question6();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number");
		int p=scanner.nextInt();
 
		obj.factorial(p);
	}

}
